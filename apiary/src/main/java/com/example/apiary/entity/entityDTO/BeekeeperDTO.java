package com.example.apiary.entity.entityDTO;

import java.util.List;

public class BeekeeperDTO {

    private Long id;
    private String name;
    private String surname;
    private boolean smoker;
    private boolean brush;
    private boolean clothes;
    private List<Long> reviews;
    private List<Long> frameExtractions;
    private List<Long> plugs;
    private List<Long> activityCalendar;
    private List<Long> equipment;

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

    public List<Long> getReviews() {
        return reviews;
    }

    public void setReviews(List<Long> reviews) {
        this.reviews = reviews;
    }

    public List<Long> getFrameExtractions() {
        return frameExtractions;
    }

    public void setFrameExtractions(List<Long> frameExtractions) {
        this.frameExtractions = frameExtractions;
    }

    public List<Long> getPlugs() {
        return plugs;
    }

    public void setPlugs(List<Long> plugs) {
        this.plugs = plugs;
    }

    public List<Long> getActivityCalendar() {
        return activityCalendar;
    }

    public void setActivityCalendar(List<Long> activityCalendar) {
        this.activityCalendar = activityCalendar;
    }

    public List<Long> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Long> equipment) {
        this.equipment = equipment;
    }
}
