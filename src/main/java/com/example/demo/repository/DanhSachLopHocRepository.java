package com.example.demo.repository;

import com.example.demo.entity.DanhSachLopHoc;
import com.example.demo.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DanhSachLopHocRepository extends JpaRepository<DanhSachLopHoc, Integer> {
    @Query("select ds from DanhSachLopHoc ds where ds.taiKhoan.email = :email and ds.lopHoc.lhMa = :malop")
    Optional<DanhSachLopHoc> findDanhSachLopHocByMaLopAndEmail(@Param("malop") int malop, @Param("email") String email);
}
