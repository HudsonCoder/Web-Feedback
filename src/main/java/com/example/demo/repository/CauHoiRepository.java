package com.example.demo.repository;

import com.example.demo.entity.CauHoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CauHoiRepository extends JpaRepository<CauHoi, Integer> {

    @Query("select ch from CauHoi ch where ch.loai.LTen = ?1 order by ch.chThuTu asc")
    List<CauHoi> getCauHoisByLoai(String loai);
}
