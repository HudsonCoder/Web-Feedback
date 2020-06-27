package com.example.demo.service.admin;

import com.example.demo.entity.KhoaHoc;
import com.example.demo.entity.NoiDungKhoaHoc;
import com.example.demo.model.KhoahocModel;
import com.example.demo.repository.KhoaHocRepository;
import com.example.demo.repository.NoiDungKhoaHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuanLyKhoaHocService {
    @Autowired
    private KhoaHocRepository khoaHocRepository;
    @Autowired
    private NoiDungKhoaHocRepository noiDungKhoaHocRepository;

    public KhoahocModel getKhoaHocById(int maKH){
        Optional<KhoaHoc> khoaHocOpl = khoaHocRepository.findById(maKH);
        if (khoaHocOpl.isPresent()){
            return KhoahocModel.toKhoaHocModel(khoaHocOpl.get());
        }

        return null;
    }

    public List<KhoahocModel> getAllKhoaHocModels(){
        return khoaHocRepository
                .findAll()
                .stream()
                .map(KhoahocModel::toKhoaHocModel)
                .collect(Collectors.toList());
    }

    public void createKhoaHoc(String ten, String noidung){
        NoiDungKhoaHoc noiDungKhoaHoc = new NoiDungKhoaHoc();
        noiDungKhoaHoc.setNdNoiDung(noidung);

        KhoaHoc khoaHoc = new KhoaHoc();
        khoaHoc.setKhTen(ten);
        khoaHoc.setNoiDungKhoaHoc(noiDungKhoaHoc);

        noiDungKhoaHocRepository.save(noiDungKhoaHoc);
        khoaHocRepository.save(khoaHoc);
    }

    public boolean updateKhoaHoc(String ten, String noidung, int maKH){
        Optional<KhoaHoc> khoaHocOpl = khoaHocRepository.findById(maKH);
        if (khoaHocOpl.isPresent()){
            KhoaHoc khoaHoc = khoaHocOpl.get();
            khoaHoc.setKhTen(ten);
            khoaHoc.getNoiDungKhoaHoc().setNdNoiDung(noidung);

            khoaHocRepository.save(khoaHoc);
            return true;
        }

        return false;
    }

    public boolean deleteKhoaHoc(int maKH){
        Optional<KhoaHoc> khoaHocOpl = khoaHocRepository.findById(maKH);
        if (khoaHocOpl.isPresent()){
            KhoaHoc khoaHoc = khoaHocOpl.get();

            Set<KhoaHoc> khoaHocs = khoaHoc.getNoiDungKhoaHoc().getKhoaHocs();
            khoaHocs.forEach( kh -> {
                if (kh.getKhMa() == maKH){
                    khoaHocs.remove(kh);
                }
            });
            khoaHoc.getNoiDungKhoaHoc().setKhoaHocs(khoaHocs);

            khoaHoc.getLopHocs().forEach( lh -> {
                lh.setKhoaHoc(null);
            });

            khoaHocRepository.deleteById(maKH);
            return true;
        }

        return false;
    }

    public int getNewMaKhoa() {
        int makhoa = 0;
        try {
            List<KhoaHoc> list = khoaHocRepository.findAll();
            if (list.size() > 0){
                makhoa = list.get(list.size() - 1).getKhMa() + 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return makhoa;
    }
}
