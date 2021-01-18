package com.example.apiary.repository;

import com.example.apiary.entity.Apiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiaryRepository extends JpaRepository<Apiary, Long> {
}
