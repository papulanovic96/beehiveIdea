package com.example.apiary.entity.entityDTO;

import java.util.List;

public class FrameOpeningDTO {

    private Long id;
    private int opened;
    private List<Long> extractions;
    private OpenerDTO openFrame;
    private FrameExtractionDTO frameExtracted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOpened() {
        return opened;
    }

    public void setOpened(int opened) {
        this.opened = opened;
    }

    public List<Long> getExtractions() {
        return extractions;
    }

    public void setExtractions(List<Long> extractions) {
        this.extractions = extractions;
    }

    public OpenerDTO getOpenFrame() {
        return openFrame;
    }

    public void setOpenFrame(OpenerDTO openFrame) {
        this.openFrame = openFrame;
    }

    public FrameExtractionDTO getFrameExtracted() {
        return frameExtracted;
    }

    public void setFrameExtracted(FrameExtractionDTO frameExtracted) {
        this.frameExtracted = frameExtracted;
    }
}
