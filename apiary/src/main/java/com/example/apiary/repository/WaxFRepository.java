package com.example.apiary.repository;

import com.example.apiary.entity.WaxFoundation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaxFRepository extends JpaRepository<WaxFoundation, Long> {
}
