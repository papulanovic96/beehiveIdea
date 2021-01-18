package com.example.apiary.entity.entityDTO;

import java.util.List;

public class HoneyExtractionDTO {

    private Long id;
    private int roundNumber;
    private ProducerDTO producerInE;
    private List<Long> packages;
    private FrameOpeningDTO frameOpening;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public ProducerDTO getProducerInE() {
        return producerInE;
    }

    public void setProducerInE(ProducerDTO producerInE) {
        this.producerInE = producerInE;
    }

    public List<Long> getPackages() {
        return packages;
    }

    public void setPackages(List<Long> packages) {
        this.packages = packages;
    }

    public FrameOpeningDTO getFrameOpening() {
        return frameOpening;
    }

    public void setFrameOpening(FrameOpeningDTO frameOpening) {
        this.frameOpening = frameOpening;
    }
}
