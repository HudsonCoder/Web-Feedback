package com.example.demo.repository;

import com.example.demo.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
        @Query(value = "select tai_khoan.* from tai_khoan\n" +
                "inner join danh_sach_lop_hoc\n" +
                "on danh_sach_lop_hoc.email = tai_khoan.email\n" +
                "inner join user_role\n" +
                "on tai_khoan.ur_ma = user_role.ur_ma\n" +
                "where danh_sach_lop_hoc.lh_ma = ?1 and ur_role = 'TEACHER';", nativeQuery = true)
        List<TaiKhoan> getTaiKhoansByMaLopHoc(int malop);
}
