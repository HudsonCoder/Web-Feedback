package com.example.demo.service.admin;

import com.example.demo.entity.CauHoi;
import com.example.demo.model.CauHoiModel;
import com.example.demo.model.LopHocModel;
import com.example.demo.repository.CauHoiRepository;
import com.example.demo.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuanLyFeedbackService {
    @Autowired
    private CauHoiRepository cauHoiRepository;
    @Autowired
    private LopHocRepository lopHocRepository;

    public List<LopHocModel> findAllLopHoc(){
        return lopHocRepository
                .findAll()
                .stream()
                .map(LopHocModel::toLopHocModel)
                .collect(Collectors.toList());
    }

    public List<CauHoiModel> getCauHoiSeminar(){
        return cauHoiRepository
                .findAll()
                .stream()
                .filter( item -> item.getLoai().getLTen().equals("SEMINAR"))
                .map(CauHoiModel::toCauHoiModel)
                .collect(Collectors.toList());
    }

    public List<CauHoiModel> getCauHoiOffile(){
        return cauHoiRepository
                .findAll()
                .stream()
                .filter( item -> item.getLoai().getLTen().equals("OFFLINE"))
                .map(CauHoiModel::toCauHoiModel)
                .collect(Collectors.toList());
    }

    public List<CauHoiModel> getCauHoiOnline(){
        return cauHoiRepository
                .findAll()
                .stream()
                .filter( item -> item.getLoai().getLTen().equals("ONLINE"))
                .map(CauHoiModel::toCauHoiModel)
                .collect(Collectors.toList());
    }

    public void updateOnline(List<String> list){
        //1..7
        List<CauHoi> onlines = cauHoiRepository
                .findAll()
                .stream()
                .filter( c -> c.getLoai().getLTen().equals("ONLINE"))
                .collect(Collectors.toList());

        for (int i=0; i<7; i++){
            onlines.get(i).setChNoiDung(list.get(i));
            cauHoiRepository.save(onlines.get(i));
        }
    }

    public void updateSeminar(List<String> list){
        //1..7
        List<CauHoi> seminars = cauHoiRepository
                .findAll()
                .stream()
                .filter( c -> c.getLoai().getLTen().equals("SEMINAR"))
                .collect(Collectors.toList());

        for (int i=0; i<12; i++){
            seminars.get(i).setChNoiDung(list.get(i));
            cauHoiRepository.save(seminars.get(i));
        }
    }

    public void updateOffile(List<String> list){
        //1..7
        List<CauHoi> offlines = cauHoiRepository
                .findAll()
                .stream()
                .filter( c -> c.getLoai().getLTen().equals("OFFLINE"))
                .collect(Collectors.toList());

        for (int i=0; i<15; i++){
            offlines.get(i).setChNoiDung(list.get(i));
            cauHoiRepository.save(offlines.get(i));
        }
    }
}
