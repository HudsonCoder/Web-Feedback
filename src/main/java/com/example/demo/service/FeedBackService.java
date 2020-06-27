package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.model.CauHoiModel;
import com.example.demo.model.ChiTietFeedbackOfflineModel;
import com.example.demo.model.ChiTietFeedbackOnlineModel;
import com.example.demo.model.ChiTietFeedbackSeminarModel;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FeedBackService {
    @Autowired
    private CauHoiRepository cauHoiRepository;
    @Autowired
    private FeedbackRepository feedbackRepository;
    @Autowired
    private LopHocRepository lopHocRepository;
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Autowired
    private LoaiRepository loaiRepository;
    @Autowired
    private ChiTietFeedbackRepository chiTietFeedbackRepository;

    public List<CauHoiModel> getDanhSachCauHoi(String loaiCauHoi){
        List<CauHoiModel> list = cauHoiRepository
                .getCauHoisByLoai(loaiCauHoi)
                .stream()
                .map(CauHoiModel::toCauHoiModel)
                .collect(Collectors.toList());

        return list;
    }

    public boolean saveFeedbackOnline(
            String cauhoi1,
            String cauhoi2,
            int cauhoi3,
            int cauhoi4,
            int cauhoi5,
            int cauhoi6,
            boolean cauhoi7,
            String email,
            int malop){

        Optional<LopHoc> lopHocOpl = lopHocRepository.findById(malop);
        if(!lopHocOpl.isPresent()){
            return false;
        }

        ChiTietFeedbackOnlineModel model = new ChiTietFeedbackOnlineModel();
        model.setCtCauHoi1(cauhoi1);
        model.setCtCauHoi2(cauhoi2);
        model.setCtCauHoi3(cauhoi3);
        model.setCtCauHoi4(cauhoi4);
        model.setCtCauHoi5(cauhoi5);
        model.setCtCauHoi6(cauhoi6);
        model.setCtCauHoi7(cauhoi7);
        ChiTietFeedback chiTietFeedback = ChiTietFeedbackOnlineModel.toChiTietFeedback(model);

        Optional<TaiKhoan> taiKhoanOpl = taiKhoanRepository.findById(email);
        TaiKhoan taiKhoan = taiKhoanOpl.get();
        LopHoc lopHoc = lopHocOpl.get();
        Loai loai = loaiRepository.findById(1).get();

        Feedback feedback = new Feedback();
        feedback.setLopHoc(lopHoc);
        feedback.setLoai(loai);
        feedback.setTaiKhoan(taiKhoan);
        feedback.setChiTietFeedback(chiTietFeedback);

        chiTietFeedbackRepository.save(chiTietFeedback);
        feedbackRepository.save(feedback);

        return true;
    }

    public boolean saveFeedbackOffline(
            String cauhoi1, String cauhoi2,
            int cauhoi3,
            int cauhoi4,
            int cauhoi5,
            int cauhoi6,
            int cauhoi7,
            int cauhoi8,
            int cauhoi9,
            int cauhoi10,
            int cauhoi11,
            int cauhoi12,
            int cauhoi13,
            int cauhoi14,
            boolean cauhoi15,
            String email,
            int malop){


        Optional<LopHoc> lopHocOpl = lopHocRepository.findById(malop);
        if(!lopHocOpl.isPresent()){
            return false;
        }

        ChiTietFeedbackOfflineModel model = new ChiTietFeedbackOfflineModel();
        model.setCtCauHoi1(cauhoi1);
        model.setCtCauHoi2(cauhoi2);
        model.setCtCauHoi3(cauhoi3);
        model.setCtCauHoi4(cauhoi4);
        model.setCtCauHoi5(cauhoi5);
        model.setCtCauHoi6(cauhoi6);
        model.setCtCauHoi7(cauhoi7);
        model.setCtCauHoi8(cauhoi8);
        model.setCtCauHoi9(cauhoi9);
        model.setCtCauHoi10(cauhoi10);
        model.setCtCauHoi11(cauhoi11);
        model.setCtCauHoi12(cauhoi12);
        model.setCtCauHoi13(cauhoi13);
        model.setCtCauHoi14(cauhoi14);
        model.setCtCauHoi15(cauhoi15);
        ChiTietFeedback chiTietFeedback = ChiTietFeedbackOfflineModel.toChiTietFeedback(model);

        Optional<TaiKhoan> taiKhoanOpl = taiKhoanRepository.findById(email);
        TaiKhoan taiKhoan = taiKhoanOpl.get();
        LopHoc lopHoc = lopHocOpl.get();
        Loai loai = loaiRepository.findById(2).get();

        Feedback feedback = new Feedback();
        feedback.setLopHoc(lopHoc);
        feedback.setLoai(loai);
        feedback.setTaiKhoan(taiKhoan);
        feedback.setChiTietFeedback(chiTietFeedback);

        chiTietFeedbackRepository.save(chiTietFeedback);
        feedbackRepository.save(feedback);

        return true;
    }

    public boolean saveFeedbackSeminar(
            String cauhoi1,
            String cauhoi2,
            String cauhoi3,
            String cauhoi4,
            String cauhoi5,
            int cauhoi6,
            int cauhoi7,
            int cauhoi8,
            int cauhoi9,
            int cauhoi10,
            int cauhoi11,
            int cauhoi12,
            String email,
            int malop){

        Optional<LopHoc> lopHocOpl = lopHocRepository.findById(malop);
        if(!lopHocOpl.isPresent()){
            return false;
        }

        ChiTietFeedbackSeminarModel model = new ChiTietFeedbackSeminarModel();
        model.setCtCauHoi1(cauhoi1);
        model.setCtCauHoi2(cauhoi2);
        model.setCtCauHoi3(cauhoi3);
        model.setCtCauHoi4(cauhoi4);
        model.setCtCauHoi5(cauhoi5);
        model.setCtCauHoi6(cauhoi6);
        model.setCtCauHoi7(cauhoi7);
        model.setCtCauHoi8(cauhoi8);
        model.setCtCauHoi9(cauhoi9);
        model.setCtCauHoi10(cauhoi10);
        model.setCtCauHoi11(cauhoi11);
        model.setCtCauHoi12(cauhoi12);

        ChiTietFeedback chiTietFeedback = ChiTietFeedbackSeminarModel.toChiTietFeedback(model);

        Optional<TaiKhoan> taiKhoanOpl = taiKhoanRepository.findById(email);
        TaiKhoan taiKhoan = taiKhoanOpl.get();
        LopHoc lopHoc = lopHocOpl.get();
        Loai loai = loaiRepository.findById(3).get();

        Feedback feedback = new Feedback();
        feedback.setLopHoc(lopHoc);
        feedback.setLoai(loai);
        feedback.setTaiKhoan(taiKhoan);
        feedback.setChiTietFeedback(chiTietFeedback);

        chiTietFeedbackRepository.save(chiTietFeedback);
        feedbackRepository.save(feedback);

        return true;
    }
}
