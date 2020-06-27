package com.example.demo.service.admin;

import com.example.demo.model.*;
import com.example.demo.repository.ChiTietFeedbackRepository;
import com.example.demo.repository.FeedbackRepository;
import com.example.demo.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViewDetailFeedbackService {
    @Autowired
    private LopHocRepository lopHocRepository;
    @Autowired
    private FeedbackRepository feedbackRepository;
    @Autowired
    private ChiTietFeedbackRepository chiTietFeedbackRepository;

    public List<ChiTietFeedbackOnlineModel> getChiTietOnlineOfClass(int malop){

        return feedbackRepository
                .getFeedbacksByLopHocId(malop)
                .stream()
                .filter(i -> i.getLoai().getLTen().equals(FeedBackModel.ONLINE))
                .map(i -> i.getChiTietFeedback())
                .map(ChiTietFeedbackOnlineModel::toChiTietFeedbackOnlineModel)
                .collect(Collectors.toList());
    }

    public List<ChartModel> getChartModelOnline(int malop){
        List<ChiTietFeedbackOnlineModel> onlineModels = getChiTietOnlineOfClass(malop);
        // So cau hoi trac nghiem la 4
        List<ChartModel> result = new ArrayList<>();
        result.add(new ChartModel());
        result.add(new ChartModel());
        result.add(new ChartModel());
        result.add(new ChartModel());

        for (int i=0; i<onlineModels.size(); i++){
            ChiTietFeedbackOnlineModel model = onlineModels.get(i);
            result.get(0).setCount( model.getCtCauHoi3());
            result.get(1).setCount( model.getCtCauHoi4());
            result.get(2).setCount( model.getCtCauHoi5());
            result.get(3).setCount( model.getCtCauHoi6());

        }

        return result;
    }

    public List<ChiTietFeedbackOfflineModel> getChiTietOfflineOfClass(int malop) {
        return feedbackRepository
                .getFeedbacksByLopHocId(malop)
                .stream()
                .filter(i -> i.getLoai().getLTen().equals(FeedBackModel.OFFLINE))
                .map(i -> i.getChiTietFeedback())
                .map(ChiTietFeedbackOfflineModel::toChiTietFeedbackOfflineModel)
                .collect(Collectors.toList());
    }

    public List<ChartModel> getChartModelOffline(int malop) {
        // 3 - 14
        List<ChiTietFeedbackOfflineModel> offlineModels = getChiTietOfflineOfClass(malop);
        // So cau hoi trac nghiem la 12
        List<ChartModel> result = new ArrayList<>();
        for (int i=0; i<12; i++){
            result.add(new ChartModel());
        }

        for (int i=0; i<offlineModels.size(); i++){
            ChiTietFeedbackOfflineModel model = offlineModels.get(i);
            result.get(0).setCount( model.getCtCauHoi3());
            result.get(1).setCount( model.getCtCauHoi4());
            result.get(2).setCount( model.getCtCauHoi5());
            result.get(3).setCount( model.getCtCauHoi6());
            result.get(4).setCount( model.getCtCauHoi7());
            result.get(5).setCount( model.getCtCauHoi8());
            result.get(6).setCount( model.getCtCauHoi9());
            result.get(7).setCount( model.getCtCauHoi10());
            result.get(8).setCount( model.getCtCauHoi11());
            result.get(9).setCount( model.getCtCauHoi12());
            result.get(10).setCount( model.getCtCauHoi13());
            result.get(11).setCount( model.getCtCauHoi14());
        }

        return result;
    }

    public List<ChiTietFeedbackSeminarModel> getChiTietSeminarOfClass(int malop) {
        return feedbackRepository
                .getFeedbacksByLopHocId(malop)
                .stream()
                .filter(i -> i.getLoai().getLTen().equals(FeedBackModel.SEMINAR))
                .map(i -> i.getChiTietFeedback())
                .map(ChiTietFeedbackSeminarModel::toChiTietFeedbackSeminarModel)
                .collect(Collectors.toList());
    }

    public List<ChartModel> getChartModelSeminar(int malop) {
        // 6 - 12
        List<ChiTietFeedbackSeminarModel> seminarModels = getChiTietSeminarOfClass(malop);
        // So cau hoi trac nghiem la 7
        List<ChartModel> result = new ArrayList<>();
        for (int i=0; i<7; i++){
            result.add(new ChartModel());
        }

        for (int i=0; i<seminarModels.size(); i++){
            ChiTietFeedbackSeminarModel model = seminarModels.get(i);
            result.get(0).setCount( model.getCtCauHoi6());
            result.get(1).setCount( model.getCtCauHoi7());
            result.get(2).setCount( model.getCtCauHoi8());
            result.get(3).setCount( model.getCtCauHoi9());
            result.get(4).setCount( model.getCtCauHoi10());
            result.get(5).setCount( model.getCtCauHoi11());
            result.get(6).setCount( model.getCtCauHoi12());
        }

        return result;
    }
}
