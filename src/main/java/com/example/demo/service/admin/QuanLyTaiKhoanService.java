package com.example.demo.service.admin;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.model.TaiKhoanModel;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuanLyTaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public List<TaiKhoanModel> getAllTaiKhoan(){
        return taiKhoanRepository
            .findAll()
            .stream()
            .map(TaiKhoanModel::toTaiKhoanModel)
            .collect(Collectors.toList());
    }

    public TaiKhoanModel findTaiKhoanByEmail(String email){
        Optional<TaiKhoan> tkOpl = taiKhoanRepository.findById(email);

        return TaiKhoanModel.toTaiKhoanModel(tkOpl.get());
    }

    public void updateTaiKhoan(TaiKhoanModel model){
        TaiKhoan taiKhoan = taiKhoanRepository.findById(model.getEmail()).get();
        taiKhoan.setTkDiaChi(model.getTkDiaChi());
        taiKhoan.setTkHovaTen(model.getTkHovaTen());
        taiKhoan.setTkSdt(model.getTkSdt());
        taiKhoan.setTkGioiTinh(model.getTkGioiTinh());

        taiKhoanRepository.save(taiKhoan);
    }
}
