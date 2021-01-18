package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.Jenter;
import java.util.Date;

public class ActivityCalendarDTO {

    private Long id;
    private Long turnus;
    private String day;
    private String hour;
    private String dayNumber;
    private String activity;
    private Long beekeeperInAC;
    private Long jenter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTurnus() {
        return turnus;
    }

    public void setTurnus(Long turnus) {
        this.turnus = turnus;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Long getBeekeeperInAC() {
        return beekeeperInAC;
    }

    public void setBeekeeperInAC(Long beekeeperInAC) {
        this.beekeeperInAC = beekeeperInAC;
    }

    public Long getJenter() {
        return jenter;
    }

    public void setJenter(Long jenter) {
        this.jenter = jenter;
    }
}
