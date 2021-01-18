package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.Beekeeper;

import java.util.List;

public class FrameExtractionDTO {

    private Long id;
    private int framesExtracted;
    private List<Long> openings;
    private BeekeeperDTO beekeeperInFO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFramesExtracted() {
        return framesExtracted;
    }

    public void setFramesExtracted(int framesExtracted) {
        this.framesExtracted = framesExtracted;
    }

    public List<Long> getOpenings() {
        return openings;
    }

    public void setOpenings(List<Long> openings) {
        this.openings = openings;
    }

    public BeekeeperDTO getBeekeeperInFO() {
        return beekeeperInFO;
    }

    public void setBeekeeperInFO(BeekeeperDTO beekeeperInFO) {
        this.beekeeperInFO = beekeeperInFO;
    }
}
