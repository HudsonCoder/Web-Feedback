package com.example.demo.controller.student;

import com.example.demo.model.CauHoiModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FeedbackController {
    @Autowired
    private FeedBackService feedBackService;

    @RequestMapping(value = "/feedback", method = RequestMethod.GET)
    public String requestFeedback(
            @RequestParam("type") String type,
            @RequestParam("malop") String malop,
            HttpSession session,
            Model model){

        List<CauHoiModel> listCauHoi = feedBackService.getDanhSachCauHoi(type);
        UserModel userModel = (UserModel) session.getAttribute("user");

        model.addAttribute("cauhois", listCauHoi);
        model.addAttribute("email", userModel.getEmail());
        model.addAttribute("malop", malop);

        return "feedback-" + type.toLowerCase();
    }

    @RequestMapping(value = "/feedback/online", method = RequestMethod.POST)
    public String getFeedbackOnline(
            @RequestParam(value = "cauhoi1", defaultValue = "") String cau_hoi_1,
            @RequestParam(value = "cauhoi2", defaultValue = "") String cau_hoi_2,
            @RequestParam("cauhoi3") int cau_hoi_3,
            @RequestParam("cauhoi4") int cau_hoi_4,
            @RequestParam("cauhoi5") int cau_hoi_5,
            @RequestParam("cauhoi6") int cau_hoi_6,
            @RequestParam("cauhoi7") boolean cau_hoi_7,
            @RequestParam("malop") int malop,
            HttpServletRequest request){

        System.out.println("Ma lop " + malop);

        UserModel userModel = (UserModel) request.getSession().getAttribute("user");
        boolean result = feedBackService.saveFeedbackOnline(cau_hoi_1, cau_hoi_2, cau_hoi_3,
                cau_hoi_4, cau_hoi_5, cau_hoi_6, cau_hoi_7, userModel.getEmail(), malop);

        System.out.println("Result :" + result);

        return "redirect:/";
    }

    @RequestMapping(value = "/feedback/offline", method = RequestMethod.POST)
    public String getFeedbackOffline(
            @RequestParam(value = "cauhoi1", defaultValue = "") String cau_hoi_1,
            @RequestParam(value = "cauhoi2", defaultValue = "") String cau_hoi_2,
            @RequestParam("cauhoi3") int cau_hoi_3,
            @RequestParam("cauhoi4") int cau_hoi_4,
            @RequestParam("cauhoi5") int cau_hoi_5,
            @RequestParam("cauhoi6") int cau_hoi_6,
            @RequestParam("cauhoi7") int cau_hoi_7,
            @RequestParam("cauhoi8") int cau_hoi_8,
            @RequestParam("cauhoi9") int cau_hoi_9,
            @RequestParam("cauhoi10") int cau_hoi_10,
            @RequestParam("cauhoi11") int cau_hoi_11,
            @RequestParam("cauhoi12") int cau_hoi_12,
            @RequestParam("cauhoi13") int cau_hoi_13,
            @RequestParam("cauhoi14") int cau_hoi_14,
            @RequestParam("cauhoi15") boolean cau_hoi_15,
            @RequestParam("malop") int malop,
            HttpServletRequest request){

        UserModel userModel = (UserModel) request.getSession().getAttribute("user");
        boolean result = feedBackService.saveFeedbackOffline(
                cau_hoi_1, cau_hoi_2, cau_hoi_3,
                cau_hoi_4, cau_hoi_5, cau_hoi_6,
                cau_hoi_7, cau_hoi_8, cau_hoi_9,
                cau_hoi_10,cau_hoi_11,cau_hoi_12,
                cau_hoi_13,cau_hoi_14,cau_hoi_15,
                userModel.getEmail(), malop);

        System.out.println("Result :" + result);

        System.out.println("OFF");
        return "redirect:/";
    }

    @RequestMapping(value = "feedback/seminar", method = RequestMethod.POST)
    public String getFeedbackSeminar(
            @RequestParam(value = "cauhoi1", defaultValue = "") String cau_hoi_1,
            @RequestParam(value = "cauhoi2", defaultValue = "") String cau_hoi_2,
            @RequestParam(value = "cauhoi3", defaultValue = "") String cau_hoi_3,
            @RequestParam(value = "cauhoi4", defaultValue = "") String cau_hoi_4,
            @RequestParam("cauhoi5") String cau_hoi_5,
            @RequestParam("cauhoi6") int cau_hoi_6,
            @RequestParam("cauhoi7") int cau_hoi_7,
            @RequestParam("cauhoi8") int cau_hoi_8,
            @RequestParam("cauhoi9") int cau_hoi_9,
            @RequestParam("cauhoi10") int cau_hoi_10,
            @RequestParam("cauhoi11") int cau_hoi_11,
            @RequestParam("cauhoi12") int cau_hoi_12,
            @RequestParam("malop") int malop,
            HttpServletRequest request){

        UserModel userModel = (UserModel) request.getSession().getAttribute("user");
        boolean result = feedBackService.saveFeedbackSeminar(
                cau_hoi_1, cau_hoi_2, cau_hoi_3,
                cau_hoi_4, cau_hoi_5, cau_hoi_6,
                cau_hoi_7, cau_hoi_8, cau_hoi_9,
                cau_hoi_10,cau_hoi_11,cau_hoi_12,
                userModel.getEmail(), malop);

        System.out.println("Result :" + result);

        System.out.println("SEMINAR");

        return "redirect:/";
    }
}
