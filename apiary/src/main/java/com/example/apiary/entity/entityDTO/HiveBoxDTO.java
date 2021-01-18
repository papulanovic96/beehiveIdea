package com.example.apiary.entity.entityDTO;

import java.util.List;

public class HiveBoxDTO {

    private Long id;
    private int frameNumber;
    private String color;
    private BeehiveDTO boxInHive;
    private List<Long> frame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BeehiveDTO getBoxInHive() {
        return boxInHive;
    }

    public void setBoxInHive(BeehiveDTO boxInHive) {
        this.boxInHive = boxInHive;
    }

    public List<Long> getFrame() {
        return frame;
    }

    public void setFrame(List<Long> frame) {
        this.frame = frame;
    }
}
