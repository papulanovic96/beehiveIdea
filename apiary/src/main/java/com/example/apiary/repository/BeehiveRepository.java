package com.example.apiary.repository;

import com.example.apiary.entity.Beehive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeehiveRepository extends JpaRepository<Beehive, Long> {
}
