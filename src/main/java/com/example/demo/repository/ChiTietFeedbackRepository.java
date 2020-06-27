package com.example.demo.repository;

import com.example.demo.entity.ChiTietFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietFeedbackRepository extends JpaRepository<ChiTietFeedback, Integer> {
}
