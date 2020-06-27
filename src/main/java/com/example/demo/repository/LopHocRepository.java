package com.example.demo.repository;

import com.example.demo.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc, Integer> {
    @Query(value = "select lop_hoc.* from lop_hoc\n" +	
            "inner join danh_sach_lop_hoc\n" +
            "on lop_hoc.lh_ma = danh_sach_lop_hoc.lh_ma\n" +
            "inner join tai_khoan\n" +
            "on tai_khoan.email = danh_sach_lop_hoc.email\n" +
            "where tai_khoan.email = :email", nativeQuery = true)
    List<LopHoc> findDanhSachLopHocsByEmail(@Param("email") String email);
}
