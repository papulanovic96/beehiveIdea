package com.example.apiary.repository;

import com.example.apiary.entity.Brood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BroodRepository extends JpaRepository<Brood, Long> {
}
