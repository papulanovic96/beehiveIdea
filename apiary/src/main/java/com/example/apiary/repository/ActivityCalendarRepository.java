package com.example.apiary.repository;

import com.example.apiary.entity.ActivityCalendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityCalendarRepository extends JpaRepository<ActivityCalendar, Long> {
}
