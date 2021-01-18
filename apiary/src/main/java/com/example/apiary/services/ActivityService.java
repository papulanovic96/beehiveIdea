package com.example.apiary.services;

import com.example.apiary.converter.ActivityConverter;
import com.example.apiary.entity.ActivityCalendar;
import com.example.apiary.entity.entityDTO.ActivityCalendarDTO;
import com.example.apiary.repository.ActivityCalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityCalendarRepository acr;

    public List<ActivityCalendarDTO> findAll() {
        List<ActivityCalendar> activityCalendars = acr.findAll();
        List<ActivityCalendarDTO> activityCalendarDTOS = ActivityConverter.fromEntityList(activityCalendars, e -> ActivityConverter.fromEntity(e));
        return activityCalendarDTOS;
    }

    public String save(ActivityCalendarDTO a) {
        acr.save(ActivityConverter.toEntity(a));
        return "Successfully added activity!";
    }
}
