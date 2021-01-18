package com.example.apiary.entity.entityDTO;

import java.util.Date;

public class WeeklyReviewDTO {

    private Long id;
    private String reviewDate;
    private String reviewType;
    private Long beehiveInWR;
    private Long beekeeperInWR;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    public Long getBeehiveInWR() {
        return beehiveInWR;
    }

    public void setBeehiveInWR(Long beehiveInWR) {
        this.beehiveInWR = beehiveInWR;
    }

    public Long getBeekeeperInWR() {
        return beekeeperInWR;
    }

    public void setBeekeeperInWR(Long beekeeperInWR) {
        this.beekeeperInWR = beekeeperInWR;
    }
}
