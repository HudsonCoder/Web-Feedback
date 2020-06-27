package com.example.demo.service;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.entity.UserRole;
import com.example.demo.repository.TaiKhoanRepository;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    public boolean registerUser(TaiKhoan user, String role){

        if (taiKhoanRepository.existsById(user.getEmail())){
            return false;
        }

        UserRole userRole = null;

        if (role.equals("STUDENT")){
            userRole = userRoleRepository.findById(2).get();
        } else if (role.equals("TEACHER")){
            userRole = userRoleRepository.findById(3).get();
        } else {
            return false;
        }

        user.setUserRole(userRole);
        taiKhoanRepository.save(user);
        return true;
    }
}
