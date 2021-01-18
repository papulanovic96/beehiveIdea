package com.example.apiary.entity.entityDTO;


import java.util.List;

public class WaxFoundationDTO {

    private Long id;
    private String foundationState;
    private List<Long> brood;
    private FrameDTO waxInFrame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoundationState() {
        return foundationState;
    }

    public void setFoundationState(String foundationState) {
        this.foundationState = foundationState;
    }

    public List<Long> getBrood() {
        return brood;
    }

    public void setBrood(List<Long> brood) {
        this.brood = brood;
    }

    public FrameDTO getWaxInFrame() {
        return waxInFrame;
    }

    public void setWaxInFrame(FrameDTO waxInFrame) {
        this.waxInFrame = waxInFrame;
    }
}
