package com.example.demo.repository;

import com.example.demo.entity.KhoaHoc;
import com.example.demo.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Integer> {
//    @Query("select lh from LopHoc lh inner join DanhSachLopHoc on LopHoc.lhMa = DanhSachLopHoc.lopHoc.lhMa where DanhSachLopHoc.taiKhoan.email = ?1")
//    List<LopHoc> findLopHocsByEmail(String email);
}
