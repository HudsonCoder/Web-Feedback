package com.example.demo.controller;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.model.UserModel;
import com.example.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        System.out.println("sign up");
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String getRegisterResult(
            @RequestParam("email") String email,
            @RequestParam("diachi") String diachi,
            @RequestParam("gender") String gioitinh,
            @RequestParam("full_name") String hoten,
            @RequestParam("password") String password,
            @RequestParam("phone") String sdt,
            @RequestParam("subject") String role,
            HttpSession session,
            Model model){

        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setEmail(email);
        taiKhoan.setTkDiaChi(diachi);
        taiKhoan.setTkGioiTinh(gioitinh);
        taiKhoan.setTkHovaTen(hoten);
        taiKhoan.setTkPassword(password);
        taiKhoan.setTkSdt(sdt);
        taiKhoan.setTkTrangThai("ACTIVE");

        if (registerService.registerUser(taiKhoan, role)){
            UserModel userModel = new UserModel();
            userModel.setRole(role);
            userModel.setName(hoten);
            userModel.setEmail(email);

            session.setAttribute("user", userModel);
            return "redirect:/";
        }

        model.addAttribute("messenger", "Email đã tồn tại!");
        return "error-messenger";
    }

}
