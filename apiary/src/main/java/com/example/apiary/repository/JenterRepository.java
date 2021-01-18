package com.example.apiary.repository;

import com.example.apiary.entity.Jenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface JenterRepository extends JpaRepository<Jenter, Long> {

}
