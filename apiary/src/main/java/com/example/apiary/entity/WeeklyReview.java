package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "weekly_review")
public class WeeklyReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String reviewDate;
    @Column
    private String reviewType;
    @ManyToOne
    private Beehive beehiveInWR;
    @ManyToOne
    private Beekeeper beekeeperInWR;

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

    public Beehive getBeehiveInWR() {
        return beehiveInWR;
    }

    public void setBeehiveInWR(Beehive beehiveInWR) {
        this.beehiveInWR = beehiveInWR;
    }

    public Beekeeper getBeekeeperInWR() {
        return beekeeperInWR;
    }

    public void setBeekeeperInWR(Beekeeper beekeeperInWR) {
        this.beekeeperInWR = beekeeperInWR;
    }
}
