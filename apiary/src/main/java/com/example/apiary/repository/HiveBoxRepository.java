package com.example.apiary.repository;

import com.example.apiary.entity.HiveBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiveBoxRepository extends JpaRepository<HiveBox, Long> {
}
