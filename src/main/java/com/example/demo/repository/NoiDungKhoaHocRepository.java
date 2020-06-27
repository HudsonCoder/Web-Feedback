package com.example.demo.repository;

import com.example.demo.entity.NoiDungKhoaHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoiDungKhoaHocRepository extends JpaRepository<NoiDungKhoaHoc, Integer> {
}
