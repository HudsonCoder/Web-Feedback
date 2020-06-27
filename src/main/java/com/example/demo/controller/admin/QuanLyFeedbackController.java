package com.example.demo.controller.admin;

import com.example.demo.model.CauHoiModel;
import com.example.demo.model.LopHocModel;
import com.example.demo.service.admin.QuanLyFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class QuanLyFeedbackController {
    @Autowired
    private QuanLyFeedbackService quanLyFeedbackService;

    @RequestMapping(value = "/viewfeedback", method = RequestMethod.GET)
    public String viewFeedback(Model model){
        List<LopHocModel> lops = quanLyFeedbackService.findAllLopHoc();
        model.addAttribute("lops", lops);

        return "admin/view-all-feedback";
    }

    @RequestMapping(value = "/editfeedback", method = RequestMethod.GET)
    public String getFeedback(Model model) {
        List<CauHoiModel> onlines = quanLyFeedbackService.getCauHoiOnline();
        List<CauHoiModel> offlines = quanLyFeedbackService.getCauHoiOffile();
        List<CauHoiModel> seminars = quanLyFeedbackService.getCauHoiSeminar();

        model.addAttribute("onlines", onlines);
        model.addAttribute("offlines", offlines);
        model.addAttribute("seminars", seminars);

        return "admin/editfeedback";
    }

    @RequestMapping(value = "/editfeedback", method = RequestMethod.POST)
    public String getFormFeedback(
            @RequestParam(value = "online1") String online1,
            @RequestParam(value = "online2") String online2,
            @RequestParam(value = "online3") String online3,
            @RequestParam(value = "online4") String online4,
            @RequestParam(value = "online5") String online5,
            @RequestParam(value = "online6") String online6,
            @RequestParam(value = "online7") String online7,

            @RequestParam(value = "offline1") String offline1,
            @RequestParam(value = "offline2") String offline2,
            @RequestParam(value = "offline3") String offline3,
            @RequestParam(value = "offline4") String offline4,
            @RequestParam(value = "offline5") String offline5,
            @RequestParam(value = "offline6") String offline6,
            @RequestParam(value = "offline7") String offline7,
            @RequestParam(value = "offline8") String offline8,
            @RequestParam(value = "offline9") String offline9,
            @RequestParam(value = "offline10") String offline10,
            @RequestParam(value = "offline11") String offline11,
            @RequestParam(value = "offline12") String offline12,
            @RequestParam(value = "offline13") String offline13,
            @RequestParam(value = "offline14") String offline14,
            @RequestParam(value = "offline15") String offline15,

            @RequestParam(value = "seminar1") String seminar1,
            @RequestParam(value = "seminar2") String seminar2,
            @RequestParam(value = "seminar3") String seminar3,
            @RequestParam(value = "seminar4") String seminar4,
            @RequestParam(value = "seminar5") String seminar5,
            @RequestParam(value = "seminar6") String seminar6,
            @RequestParam(value = "seminar7") String seminar7,
            @RequestParam(value = "seminar8") String seminar8,
            @RequestParam(value = "seminar9") String seminar9,
            @RequestParam(value = "seminar10") String seminar10,
            @RequestParam(value = "seminar11") String seminar11,
            @RequestParam(value = "seminar12") String seminar12) {

        System.out.println("Update cau hoi");

        List<String> listOn = new ArrayList<>();
        listOn.add(online1);
        listOn.add(online2);
        listOn.add(online3);
        listOn.add(online4);
        listOn.add(online5);
        listOn.add(online6);
        listOn.add(online7);
        quanLyFeedbackService.updateOnline(listOn);

        List<String> listOff = new ArrayList<>();
        listOff.add(offline1);
        listOff.add(offline2);
        listOff.add(offline3);
        listOff.add(offline4);
        listOff.add(offline5);
        listOff.add(offline6);
        listOff.add(offline7);
        listOff.add(offline8);
        listOff.add(offline9);
        listOff.add(offline10);
        listOff.add(offline11);
        listOff.add(offline12);
        listOff.add(offline13);
        listOff.add(offline14);
        listOff.add(offline15);

        quanLyFeedbackService.updateOffile(listOff);

        List<String> listSe = new ArrayList<>();
        listSe.add(seminar1);
        listSe.add(seminar2);
        listSe.add(seminar3);
        listSe.add(seminar4);
        listSe.add(seminar5);
        listSe.add(seminar6);
        listSe.add(seminar7);
        listSe.add(seminar8);
        listSe.add(seminar9);
        listSe.add(seminar10);
        listSe.add(seminar11);
        listSe.add(seminar12);

        quanLyFeedbackService.updateSeminar(listSe);

        return "redirect:/admin/editfeedback";
    }

}
