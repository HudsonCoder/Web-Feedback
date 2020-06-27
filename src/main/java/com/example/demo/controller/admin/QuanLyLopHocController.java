package com.example.demo.controller.admin;

import com.example.demo.model.KhoahocModel;
import com.example.demo.model.LopHocModel;
import com.example.demo.model.TaiKhoanModel;
import com.example.demo.service.admin.QuanLyLopHocServie;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuanLyLopHocController {
    @Autowired
    private QuanLyLopHocServie quanLyLopHocServie;

    @RequestMapping(value = {"/admin/classes", "/admin"} , method = RequestMethod.GET)
    public String getDanhSachLopHoc(Model model){
        List<LopHocModel> lops = quanLyLopHocServie.findAllLopHocModel();
        model.addAttribute("lops", lops);

        return "admin/classes";
    }

    @RequestMapping(value = "/admin/classes/{malop}", method = RequestMethod.GET)
    public String getDanhSachLopHocByMaLop(@PathVariable("malop") int malop, Model model){

        List<TaiKhoanModel> students = quanLyLopHocServie.findAllHocSinhOfClass(malop);
//        List<TaiKhoanModel> teachers = quanLyLopHocServie.findGiaoVienOfClass(malop);

        System.out.println(students);
//        System.out.println(teachers);
//        model.addAttribute("teachers", teachers);
        model.addAttribute("students", students);
        return "admin/viewclass";
    }

    @RequestMapping(value = "/admin/classes/{malop}", method = RequestMethod.POST)
    public String deleteHocVienFromLopHoc(
            @RequestParam("email") String email,
            @PathVariable("malop") int malop,
            Model model){

        boolean result = quanLyLopHocServie.deleteStudentOfClass(malop, email);
        System.out.println("Xoa lop: " + malop);
        System.out.println("Xoa email: " + email);

        if (result == false){
            System.out.println("Xoa khong hop le");
        }

        return "redirect:/admin/classes/" + malop;
    }

    @RequestMapping(value = "/admin/addclasses", method = RequestMethod.GET)
    public String addLopHoc(Model model){
        List<TaiKhoanModel> teachers = quanLyLopHocServie.getAllTeacher();
        List<TaiKhoanModel> students = quanLyLopHocServie.getAllStudent();
        List<KhoahocModel> khoahocs = quanLyLopHocServie.getAllKhoaHoc();
     
        int malop = quanLyLopHocServie.getNewMaLop();
        model.addAttribute("teachers", teachers);
        model.addAttribute("students", students);
        model.addAttribute("malop", malop);
        model.addAttribute("khoahocs", khoahocs);

        return "admin/addclasses";
    }

    @RequestMapping(value = "/admin/addclasses", method = RequestMethod.POST)
    public String addFromLopHoc(
            @RequestParam("tenlop") String tenLop,
            @RequestParam("maKH") int maKH,
            @RequestParam("students") List<String> studentEmails,
            @RequestParam("teacher") String teacherEmail){

        quanLyLopHocServie.addNewLopHoc(teacherEmail, studentEmails, tenLop, maKH);

        return "redirect:/admin/classes";
    }

    @RequestMapping(value = "/admin/editclasses", method = RequestMethod.GET)
    public String editLopHoc(@RequestParam("malop") int maLH, Model model){
        System.out.println("Ma lop: " + maLH);

        LopHocModel lopHocModel = quanLyLopHocServie.findLopHocByID(maLH);
        List<KhoahocModel> khoahocs = quanLyLopHocServie.getAllKhoaHoc();
        List<TaiKhoanModel> teachers = quanLyLopHocServie.getAllTeacher();
        List<TaiKhoanModel> students = quanLyLopHocServie.getAllStudent();
        List<TaiKhoanModel> oldStudents = quanLyLopHocServie.findAllHocSinhOfClass(maLH);
        students.removeAll(oldStudents);

        model.addAttribute("lophoc", lopHocModel);
        model.addAttribute("teachers", teachers);
        model.addAttribute("students", students);
        model.addAttribute("khoahocs", khoahocs);

        return "admin/updateclasses";
    }

    @RequestMapping(value = "/admin/editclasses", method = RequestMethod.POST)
    public String editFormLopHoc(
            @RequestParam("malop") int maLH,
            @RequestParam("tenlop") String tenLop,
            @RequestParam("maKH") int maKH,
            @RequestParam(value = "students", required = false) List<String> studentEmails,
            @RequestParam("teacher") String teacherEmail){

        quanLyLopHocServie.updateLopHoc(maLH, maKH, tenLop, teacherEmail, studentEmails);

        return "redirect:/admin/classes";
    }

}
