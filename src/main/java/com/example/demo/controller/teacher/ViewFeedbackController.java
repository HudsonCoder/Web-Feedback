package com.example.demo.controller.teacher;

import com.example.demo.model.*;
import com.example.demo.service.FeedBackService;
import com.example.demo.service.ViewFeedbackService;
import com.example.demo.service.admin.QuanLyFeedbackService;
import com.example.demo.service.admin.ViewDetailFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewFeedbackController {
    @Autowired
    private FeedBackService feedBackService;
    @Autowired
    private ViewFeedbackService viewFeedbackService;

    @Autowired
    private QuanLyFeedbackService quanLyFeedbackService;
    @Autowired
    private ViewDetailFeedbackService viewDetailFeedbackService;

    @RequestMapping(value = "/viewfeedback", method = RequestMethod.GET)
    public String getViewFeedback(
            @RequestParam("type") String type,
            @RequestParam("malop") int malop,
            Model model){

        System.out.println(type + " - " + malop);

        if (type.equals("ONLINE")){
            List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiOnline();
            List<ChiTietFeedbackOnlineModel> onlines = viewDetailFeedbackService.getChiTietOnlineOfClass(malop);
            List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelOnline(malop);

            System.out.println(chartModelOnline);

            model.addAttribute("data", chartModelOnline);
            model.addAttribute("cauhois", cauhois);
            model.addAttribute("onlines", onlines);

            return "view-feedback-online";

        } else if ((type.equals("OFFLINE"))){
            List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiOffile();
            List<ChiTietFeedbackOfflineModel> offlines = viewDetailFeedbackService.getChiTietOfflineOfClass(malop);
            List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelOffline(malop);

            System.out.println(chartModelOnline);

            model.addAttribute("data", chartModelOnline);
            model.addAttribute("cauhois", cauhois);
            model.addAttribute("offlines", offlines);

            return "view-feedback-offline";

        } else if (type.equals("SEMINAR")){
//            List<CauHoiModel> listCauHoi = feedBackService.getDanhSachCauHoi(type);
//            model.addAttribute("cauhois", listCauHoi);
//
//            List<ChiTietFeedbackSeminarModel> feedbacks = viewFeedbackService.getChiTietSeminars(malop);
//            model.addAttribute("feedbacks", feedbacks);
            List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiSeminar();
            List<ChiTietFeedbackSeminarModel> seminars = viewDetailFeedbackService.getChiTietSeminarOfClass(malop);
            List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelSeminar(malop);

            System.out.println(chartModelOnline);

            model.addAttribute("data", chartModelOnline);
            model.addAttribute("cauhois", cauhois);
            model.addAttribute("seminars", seminars);

            return "view-feedback-seminar";
        }

        model.addAttribute("messenger", "Trang truy cập không hợp lệ!");
        return "error-messenger";
    }

}
