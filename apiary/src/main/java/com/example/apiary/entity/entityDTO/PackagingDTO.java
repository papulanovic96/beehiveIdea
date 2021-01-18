package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.HoneyExtraction;

import java.util.List;

public class PackagingDTO {

    private Long id;
    private boolean filled;
    private int volume;
    private List<Long> extractions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Long> getExtractions() {
        return extractions;
    }

    public void setExtractions(List<Long> extractions) {
        this.extractions = extractions;
    }
}
