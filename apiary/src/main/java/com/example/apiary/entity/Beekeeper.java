package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Beekeeper{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private boolean smoker;
    @Column
    private boolean brush;
    @Column
    private boolean clothes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beekeeperInWR", cascade = CascadeType.ALL)
    private Collection<WeeklyReview> reviews;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beekeeperInFO", cascade = CascadeType.ALL)
    private Collection<FrameExtraction> frameExtractions;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beekeeperInPlug", cascade = CascadeType.ALL)
    private Collection<Plugs> plugs;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beekeeperInAC", cascade = CascadeType.ALL)
    private Collection<ActivityCalendar> activityCalendar;

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isBrush() {
        return brush;
    }

    public void setBrush(boolean brush) {
        this.brush = brush;
    }

    public boolean isClothes() {
        return clothes;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }

    public Collection<WeeklyReview> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<WeeklyReview> reviews) {
        this.reviews = reviews;
    }

    public Collection<FrameExtraction> getFrameExtractions() {
        return frameExtractions;
    }

    public void setFrameExtractions(Collection<FrameExtraction> frameExtractions) {
        this.frameExtractions = frameExtractions;
    }

    public Collection<Plugs> getPlugs() {
        return plugs;
    }

    public void setPlugs(Collection<Plugs> plugs) {
        this.plugs = plugs;
    }

    public Collection<ActivityCalendar> getActivityCalendar() {
        return activityCalendar;
    }

    public void setActivityCalendar(Collection<ActivityCalendar> activityCalendar) {
        this.activityCalendar = activityCalendar;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
