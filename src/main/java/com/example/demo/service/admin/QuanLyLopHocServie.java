package com.example.demo.service.admin;

import com.example.demo.entity.DanhSachLopHoc;
import com.example.demo.entity.KhoaHoc;
import com.example.demo.entity.LopHoc;
import com.example.demo.entity.TaiKhoan;
import com.example.demo.model.KhoahocModel;
import com.example.demo.model.LopHocModel;
import com.example.demo.model.TaiKhoanModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.DanhSachLopHocRepository;
import com.example.demo.repository.KhoaHocRepository;
import com.example.demo.repository.LopHocRepository;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuanLyLopHocServie {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired
    private LopHocRepository lopHocRepository;
    @Autowired
    private DanhSachLopHocRepository danhSachLopHocRepository;
    @Autowired
    private KhoaHocRepository khoaHocRepository;
    
    public List<KhoahocModel> getAllKhoaHoc(){
    	return khoaHocRepository
    			.findAll()
    			.stream()
    			.map(KhoahocModel::toKhoaHocModel)
    			.collect(Collectors.toList());
    }
  
    public List<LopHocModel> findAllLopHocModel(){
        return lopHocRepository
                .findAll()
                .stream()
                .map(LopHocModel::toLopHocModel)
                .collect(Collectors.toList());
    }

    public boolean addNewLopHoc(String teacherEmail, List<String> studentEmails, String tenLop, int maKH){
        System.out.println("teacher: " + teacherEmail);
        System.out.println("students: " + studentEmails);
        
        KhoaHoc khoaHoc = khoaHocRepository.findById(maKH).get();
  
        LopHoc lopHoc = new LopHoc();
        lopHoc.setLhTen(tenLop);
        lopHoc.setKhoaHoc(khoaHoc);
        lopHocRepository.save(lopHoc);
        
        studentEmails.forEach( i -> {
            DanhSachLopHoc danhSachLopHoc = new DanhSachLopHoc();
            TaiKhoan taiKhoan = taiKhoanRepository.findById(i).get();
            
            danhSachLopHoc.setLopHoc(lopHoc);
            danhSachLopHoc.setTaiKhoan(taiKhoan);
            danhSachLopHocRepository.save(danhSachLopHoc);

        });

        TaiKhoan teacher = taiKhoanRepository.findById(teacherEmail).get();
        
        DanhSachLopHoc danhSachLopHoc = new DanhSachLopHoc();
        danhSachLopHoc.setTaiKhoan(teacher);
        danhSachLopHoc.setLopHoc(lopHoc);
        danhSachLopHocRepository.save(danhSachLopHoc);

        return true;
    }

    public List<TaiKhoanModel> findAllHocSinhOfClass(int malop){
        return lopHocRepository
                .findById(malop)
                .get()
                .getDanhSachLopHocs()
                .stream()
                .map( i -> i.getTaiKhoan())
                .filter(i -> i.getUserRole().getUrRole().equals(UserModel.STUDENT))
                .map(TaiKhoanModel::toTaiKhoanModel)
                .collect(Collectors.toList());
    }

    public List<TaiKhoanModel> findGiaoVienOfClass(int malop){
        return lopHocRepository
                .findById(malop)
                .get()
                .getDanhSachLopHocs()
                .stream()
                .map( i -> i.getTaiKhoan())
                .filter(i -> i.getUserRole().getUrRole().equals(UserModel.TEACHER))
                .map(TaiKhoanModel::toTaiKhoanModel)
                .collect(Collectors.toList());
    }

    public boolean deleteStudentOfClass(int malop, String email){
        Optional<DanhSachLopHoc> dsOpl = danhSachLopHocRepository.findDanhSachLopHocByMaLopAndEmail(malop, email);
        if (!dsOpl.isPresent()){
            System.out.println("Khong ton tai email va lop hoc: " + email + " : " + malop);
            return false;
        }
        DanhSachLopHoc danhSachLopHoc = dsOpl.get();
        danhSachLopHocRepository.delete(danhSachLopHoc);
        return true;
    }

    public List<TaiKhoanModel> getAllTeacher() {
        return taiKhoanRepository
                .findAll()
                .stream()
                .filter(i -> i.getUserRole().getUrRole().equals(UserModel.TEACHER))
                .map(TaiKhoanModel::toTaiKhoanModel)
                .collect(Collectors.toList());
    }

    public List<TaiKhoanModel> getAllStudent() {
        return taiKhoanRepository
                .findAll()
                .stream()
                .filter(i -> i.getUserRole().getUrRole().equals(UserModel.STUDENT))
                .map(TaiKhoanModel::toTaiKhoanModel)
                .collect(Collectors.toList());
    }

    public int getNewMaLop() {
        int malop = 0;
        try {
            List<LopHoc> list = lopHocRepository.findAll();
            if (list.size() > 0){
                malop = list.get(list.size() - 1).getLhMa() + 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return malop;
    }

    public LopHocModel findLopHocByID(int maLH) {
        Optional<LopHoc> lopHocOpl = lopHocRepository.findById(maLH);
        if (lopHocOpl.isPresent()){
            return LopHocModel.toLopHocModel(lopHocOpl.get());
        }
        return null;
    }

    public void updateLopHoc(int maLH, int maKH, String tenLop, String teacherEmail, List<String> studentEmails) {
        LopHoc lopHoc = lopHocRepository.findById(maLH).get();
        KhoaHoc khoaHoc = khoaHocRepository.findById(maKH).get();
        TaiKhoan teacher = taiKhoanRepository.findById(teacherEmail).get();

        lopHoc.setKhoaHoc(khoaHoc);
        lopHoc.setLhTen(tenLop);

        Set<DanhSachLopHoc> danhSachLopHocs = lopHoc.getDanhSachLopHocs();
        DanhSachLopHoc oldDS = danhSachLopHocs.stream()
                .filter(i -> i.getTaiKhoan().getUserRole().getUrRole().equals(UserModel.TEACHER))
                .findFirst()
                .get();

        danhSachLopHocs.remove(oldDS);
        danhSachLopHocRepository.delete(oldDS);

        DanhSachLopHoc ds = new DanhSachLopHoc();
        ds.setLopHoc(lopHoc);
        ds.setTaiKhoan(teacher);
        danhSachLopHocRepository.save(ds);

        danhSachLopHocs.add(ds);
        lopHoc.setDanhSachLopHocs(danhSachLopHocs);
        lopHocRepository.save(lopHoc);

        if (studentEmails == null){
            return;
        }

        studentEmails.forEach( i -> {
            DanhSachLopHoc danhSachLopHoc = new DanhSachLopHoc();
            TaiKhoan taiKhoan = taiKhoanRepository.findById(i).get();

            danhSachLopHoc.setLopHoc(lopHoc);
            danhSachLopHoc.setTaiKhoan(taiKhoan);
            danhSachLopHocRepository.save(danhSachLopHoc);

        });
    }
}
