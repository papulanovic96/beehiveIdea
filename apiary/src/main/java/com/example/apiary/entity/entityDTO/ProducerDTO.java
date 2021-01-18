package com.example.apiary.entity.entityDTO;


import java.util.List;

public class ProducerDTO {

    private String extractorType;
    private int frameNumber;
    private List<Long> extractions;

    public String getExtractorType() {
        return extractorType;
    }

    public void setExtractorType(String extractorType) {
        this.extractorType = extractorType;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public List<Long> getExtractions() {
        return extractions;
    }

    public void setExtractions(List<Long> extractions) {
        this.extractions = extractions;
    }
}
