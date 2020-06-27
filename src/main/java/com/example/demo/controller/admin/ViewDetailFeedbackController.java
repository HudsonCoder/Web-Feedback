package com.example.demo.controller.admin;

import com.example.demo.model.*;
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
@RequestMapping("/admin")
public class ViewDetailFeedbackController {
    @Autowired
    private QuanLyFeedbackService quanLyFeedbackService;
    @Autowired
    private ViewDetailFeedbackService viewDetailFeedbackService;

    @RequestMapping(value = "/detail/online", method = RequestMethod.GET)
    public String getDetailOnline(@RequestParam("malop") int malop, Model model){
        System.out.println("malop: " + malop);

        List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiOnline();
        List<ChiTietFeedbackOnlineModel> onlines = viewDetailFeedbackService.getChiTietOnlineOfClass(malop);
        List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelOnline(malop);

        System.out.println(chartModelOnline);

        model.addAttribute("data", chartModelOnline);
        model.addAttribute("cauhois", cauhois);
        model.addAttribute("onlines", onlines);

        return "admin/detail-online";
    }

    @RequestMapping(value = "/detail/offline", method = RequestMethod.GET)
    public String getDetailOffline(@RequestParam("malop") int malop, Model model){
        System.out.println("malop: " + malop);

        List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiOffile();
        List<ChiTietFeedbackOfflineModel> offlines = viewDetailFeedbackService.getChiTietOfflineOfClass(malop);
        List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelOffline(malop);

        System.out.println(chartModelOnline);

        model.addAttribute("data", chartModelOnline);
        model.addAttribute("cauhois", cauhois);
        model.addAttribute("offlines", offlines);

        return "admin/detail-offline";
    }

    @RequestMapping(value = "/detail/seminar", method = RequestMethod.GET)
    public String getDetailSeminar(@RequestParam("malop") int malop, Model model){
        System.out.println("malop: " + malop);

        List<CauHoiModel> cauhois = quanLyFeedbackService.getCauHoiSeminar();
        List<ChiTietFeedbackSeminarModel> seminars = viewDetailFeedbackService.getChiTietSeminarOfClass(malop);
        List<ChartModel> chartModelOnline = viewDetailFeedbackService.getChartModelSeminar(malop);

        System.out.println(chartModelOnline);

        model.addAttribute("data", chartModelOnline);
        model.addAttribute("cauhois", cauhois);
        model.addAttribute("seminars", seminars);

        return "admin/detail-seminar";
    }
}
