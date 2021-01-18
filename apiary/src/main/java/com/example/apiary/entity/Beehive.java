package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "beehive")
public class Beehive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private int boxNumber;
    @Column
    private String type;
    @ManyToOne
    private Apiary hiveInApiary;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "boxInHive", cascade = CascadeType.ALL)
    private Collection<HiveBox> boxes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "beehiveInWR", cascade = CascadeType.ALL)
    private Collection<WeeklyReview> reviews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Apiary getHiveInApiary() {
        return hiveInApiary;
    }

    public void setHiveInApiary(Apiary hiveInApiary) {
        this.hiveInApiary = hiveInApiary;
    }

    public Collection<HiveBox> getBoxes() {
        return boxes;
    }

    public void setBoxes(Collection<HiveBox> boxes) {
        this.boxes = boxes;
    }

    public Collection<WeeklyReview> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<WeeklyReview> reviews) {
        this.reviews = reviews;
    }
}
