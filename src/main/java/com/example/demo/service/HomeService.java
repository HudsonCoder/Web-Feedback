package com.example.demo.service;

import com.example.demo.entity.LopHoc;
import com.example.demo.model.LopHocModel;
import com.example.demo.repository.DanhSachLopHocRepository;
import com.example.demo.repository.KhoaHocRepository;
import com.example.demo.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {
    @Autowired
    private LopHocRepository lopHocRepository;

    public List<LopHocModel> getClassesOfStudent(String email){
        List<LopHoc> lopHocs = lopHocRepository.findDanhSachLopHocsByEmail(email);

        return lopHocs.stream()
                .map(LopHocModel::toLopHocModel)
                .collect(Collectors.toList());
    }
}
