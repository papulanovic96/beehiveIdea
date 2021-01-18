package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.HiveBox;
import java.util.List;

public class FrameDTO {

    private Long id;
    private String type;
    private boolean capacity;
    private HiveBoxDTO frameInBox;
    private List<Long> waxFoundation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCapacity() {
        return capacity;
    }

    public void setCapacity(boolean capacity) {
        this.capacity = capacity;
    }

    public HiveBoxDTO getFrameInBox() {
        return frameInBox;
    }

    public void setFrameInBox(HiveBoxDTO frameInBox) {
        this.frameInBox = frameInBox;
    }

    public List<Long> getWaxFoundation() {
        return waxFoundation;
    }

    public void setWaxFoundation(List<Long> waxFoundation) {
        this.waxFoundation = waxFoundation;
    }
}
