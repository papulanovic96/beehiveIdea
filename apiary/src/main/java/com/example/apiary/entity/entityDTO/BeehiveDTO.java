package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.Apiary;
import java.util.List;

public class BeehiveDTO {

    private Long id;
    private int boxNumber;
    private String type;
    private Long hiveInApiary;
    private List<Long> boxes;
    private List<Long> reviews;

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

    public Long getHiveInApiary() {
        return hiveInApiary;
    }

    public void setHiveInApiary(Long hiveInApiary) {
        this.hiveInApiary = hiveInApiary;
    }

    public List<Long> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Long> boxes) {
        this.boxes = boxes;
    }

    public List<Long> getReviews() {
        return reviews;
    }

    public void setReviews(List<Long> reviews) {
        this.reviews = reviews;
    }
}
