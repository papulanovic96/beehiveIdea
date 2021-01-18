package com.example.apiary.repository;

import com.example.apiary.entity.WeeklyReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyReviewRepository extends JpaRepository<WeeklyReview, Long> {
}
