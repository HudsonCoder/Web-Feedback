package com.example.demo.controller.admin;

import com.example.demo.model.TaiKhoanModel;
import com.example.demo.service.admin.QuanLyKhoaHocService;
import com.example.demo.service.admin.QuanLyTaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class QuanLyTaiKhoanController {
    @Autowired
    private QuanLyTaiKhoanService quanLyTaiKhoanService;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String getQuanLyTaiKhoan(Model model){
        List<TaiKhoanModel> list = quanLyTaiKhoanService.getAllTaiKhoan();
        model.addAttribute("taikhoans", list);
        return "admin/account";
    }

    @RequestMapping(value = "/editaccount", method = RequestMethod.GET)
    public String getUpdateTaiKhoan(
            @RequestParam("email") String email,
            Model model){

        System.out.println(email);
        TaiKhoanModel tk = quanLyTaiKhoanService.findTaiKhoanByEmail(email);
        model.addAttribute("taikhoan", tk);

        System.out.println("tk" + tk);
        return "admin/updateaccount";
    }

    @RequestMapping(value = "/editaccount", method = RequestMethod.POST)
    public String getFormUpdateTaiKhoan(
            @RequestParam("email") String email,
            @RequestParam("ten") String ten,
            @RequestParam("gioitinh") String gioiTinh,
            @RequestParam("diachi") String diaChi,
            @RequestParam("sdt") String sdt){

        System.out.println("Email: " + email);

        TaiKhoanModel model = new TaiKhoanModel();
        model.setTkSdt(sdt);
        model.setTkHovaTen(ten);
        model.setTkGioiTinh(gioiTinh);
        model.setTkDiaChi(diaChi);
        model.setEmail(email);

        System.out.println(model);

        quanLyTaiKhoanService.updateTaiKhoan(model);

        return "redirect:/admin/account";
    }
}
