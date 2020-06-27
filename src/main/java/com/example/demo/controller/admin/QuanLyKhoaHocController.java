package com.example.demo.controller.admin;

import com.example.demo.model.KhoahocModel;
import com.example.demo.service.admin.QuanLyKhoaHocService;
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
public class QuanLyKhoaHocController {
    @Autowired
    private QuanLyKhoaHocService quanLyKhoaHocService;

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String getCourses(Model model){
        List<KhoahocModel> list = quanLyKhoaHocService.getAllKhoaHocModels();
        model.addAttribute("khoahocs", list);

        return "admin/courses";
    }

    @RequestMapping(value = "/deletecourses/{makhoa}", method = RequestMethod.POST)
    public String getCourses(
            @PathVariable("makhoa") int maKhoa,
            Model model){

        quanLyKhoaHocService.deleteKhoaHoc(maKhoa);

        return "redirect:/admin/courses";
    }

    @RequestMapping(value = "/editcourses/{makhoa}", method = RequestMethod.GET)
    public String updateCourses(
            @PathVariable("makhoa") int maKhoa,
            Model model){

        System.out.println("put " + maKhoa);

        KhoahocModel khoahocModel = quanLyKhoaHocService.getKhoaHocById(maKhoa);
        if (khoahocModel == null){
            return "redirect:/admin/courses";
        }

        model.addAttribute("khoahoc", khoahocModel);

        return "admin/updatecourses";
    }

    @RequestMapping(value = "/editcourses/{makhoa}", method = RequestMethod.POST)
    public String updateFromCourses(
            @PathVariable("makhoa") int maKhoa,
            @RequestParam("tenkhoa") String ten,
            @RequestParam("noidung") String noidung){

        System.out.println("update " + maKhoa);
        quanLyKhoaHocService.updateKhoaHoc(ten, noidung, maKhoa);

        return "redirect:/admin/courses";
    }

    @RequestMapping(value = "/addcourses", method = RequestMethod.GET)
    public String createCourses(Model model){
        int makhoa = quanLyKhoaHocService.getNewMaKhoa();
        model.addAttribute("makhoa", makhoa);
        return "admin/addcourse";
    }

    @RequestMapping(value = "/addcourses", method = RequestMethod.POST)
    public String createCourses(
            @RequestParam(value = "tenkhoa", defaultValue = "") String ten,
            @RequestParam(value = "noidung", defaultValue = "") String noidung,
            Model model){
        System.out.println("ten: " + ten);
        System.out.println("nd: " + noidung);

        quanLyKhoaHocService.createKhoaHoc(ten, noidung);
        model.addAttribute("messenger", "Bạn đã thêm thành công!");

        return "redirect:/admin/courses";
    }

}
