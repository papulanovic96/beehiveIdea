package com.example.apiary.converter;

import com.example.apiary.entity.ActivityCalendar;
import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.entityDTO.ActivityCalendarDTO;
import com.example.apiary.repository.JenterRepository;

public class ActivityConverter extends AbstractConverter {

    private static JenterRepository jr;

    public ActivityConverter(JenterRepository jr) {
        this.jr = jr;
    }

    public static ActivityCalendarDTO fromEntity(ActivityCalendar e) {
        if(e != null) {
            ActivityCalendarDTO calendarDTO = new ActivityCalendarDTO();
            calendarDTO.setId(e.getId());
            calendarDTO.setActivity(e.getActivity());
            calendarDTO.setDay(e.getDay());
            calendarDTO.setDayNumber(e.getDayNumber());
            calendarDTO.setHour(e.getHour());
            calendarDTO.setTurnus(e.getTurnus());
            Beekeeper beekeeper = e.getBeekeeperInAC();
            Long beekeeperDTO = null;
            if(beekeeper != null) {
                beekeeperDTO = beekeeper.getId();
            }
            calendarDTO.setBeekeeperInAC(beekeeperDTO);

            return calendarDTO;
        } else {
            return null;
        }
    }

    public static ActivityCalendar toEntity(ActivityCalendarDTO d) {
        if(d != null) {
            ActivityCalendar calendar = new ActivityCalendar();
            calendar.setId(d.getId());
            calendar.setActivity(d.getActivity());
            calendar.setDay(d.getDay());
            calendar.setHour(d.getHour());
            calendar.setDayNumber(d.getDayNumber());
            calendar.setTurnus(d.getTurnus());

            Long beekeeperDTO = d.getBeekeeperInAC();
            Beekeeper beekeeper = new Beekeeper();
            if(beekeeperDTO != null) {
                beekeeper.setId(beekeeperDTO);
            }
            calendar.setBeekeeperInAC(beekeeper);
            return calendar;
        } else {
            return null;
        }
    }
}
