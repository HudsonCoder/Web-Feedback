package com.example.demo.service;

import com.example.demo.entity.ChiTietFeedback;
import com.example.demo.entity.Feedback;
import com.example.demo.model.ChiTietFeedbackOfflineModel;
import com.example.demo.model.ChiTietFeedbackOnlineModel;
import com.example.demo.model.ChiTietFeedbackSeminarModel;
import com.example.demo.model.FeedBackModel;
import com.example.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViewFeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<ChiTietFeedbackOfflineModel> getChiTietOfflines(int malop){
        List<Feedback> feedbacks = feedbackRepository.getFeedbacksByLopHocId(malop);
        List<ChiTietFeedback> list =new ArrayList<>();

        feedbacks.forEach( item -> {
            if (item.getLoai().getLTen().equals(FeedBackModel.OFFLINE)){
                list.add(item.getChiTietFeedback());
            }
        });

        return list
                .stream()
                .map(ChiTietFeedbackOfflineModel::toChiTietFeedbackOfflineModel)
                .collect(Collectors.toList());

    }

    public List<ChiTietFeedbackOnlineModel> getChiTietOnlines(int malop){
        List<Feedback> feedbacks = feedbackRepository.getFeedbacksByLopHocId(malop);
        List<ChiTietFeedback> list =new ArrayList<>();

        feedbacks.forEach( item -> {
            if (item.getLoai().getLTen().equals(FeedBackModel.OFFLINE)){
                list.add(item.getChiTietFeedback());
            }
        });

        return list
                .stream()
                .map(ChiTietFeedbackOnlineModel::toChiTietFeedbackOnlineModel)
                .collect(Collectors.toList());
    }

    public List<ChiTietFeedbackSeminarModel> getChiTietSeminars(int malop) {
        List<Feedback> feedbacks = feedbackRepository.getFeedbacksByLopHocId(malop);
        List<ChiTietFeedback> list =new ArrayList<>();

        feedbacks.forEach( item -> {
            if (item.getLoai().getLTen().equals(FeedBackModel.OFFLINE)){
                list.add(item.getChiTietFeedback());
            }
        });

        return list
                .stream()
                .map(ChiTietFeedbackSeminarModel::toChiTietFeedbackSeminarModel)
                .collect(Collectors.toList());
    }
}
