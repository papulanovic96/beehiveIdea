package com.example.apiary.repository;

import com.example.apiary.entity.Beekeeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeekeeperRepository extends JpaRepository<Beekeeper, Long> {
}
