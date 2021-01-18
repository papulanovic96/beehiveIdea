package com.example.apiary.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "activity_calendar")
public class ActivityCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private Long turnus;
    @Column
    private String day;
    @Column
    private String hour;
    @Column
    private String dayNumber;
    @Column
    private String activity;
    @ManyToOne
    private Beekeeper beekeeperInAC;

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

    public Beekeeper getBeekeeperInAC() {
        return beekeeperInAC;
    }

    public void setBeekeeperInAC(Beekeeper beekeeperInAC) {
        this.beekeeperInAC = beekeeperInAC;
    }

}
