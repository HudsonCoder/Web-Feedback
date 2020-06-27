package com.example.demo.service;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.model.UserModel;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public UserModel login(String email, String password){
        
        Optional<TaiKhoan> taiKhoan = taiKhoanRepository.findById(email);
        if (taiKhoan.isPresent()){
            TaiKhoan tk = taiKhoan.get();

            if (!tk.getTkPassword().equals(password)){
                return null;
            }

            UserModel userModel = new UserModel();
            userModel.setEmail(tk.getEmail());
            userModel.setName(tk.getTkHovaTen());
            userModel.setRole(tk.getUserRole().getUrRole());
            return userModel;
        }

        return null;
    }
}
