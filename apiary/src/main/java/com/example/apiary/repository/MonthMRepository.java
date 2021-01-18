package com.example.apiary.repository;

import com.example.apiary.entity.MonthlyMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthMRepository extends JpaRepository<MonthlyMaintenance, Long> {
}
