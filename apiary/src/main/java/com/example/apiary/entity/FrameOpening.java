package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "frame_opening")
public class FrameOpening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private int opened;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "frameOpening", cascade = CascadeType.ALL)
    private Collection<HoneyExtraction> extractions;
    @ManyToOne
    private Opener openFrame;
    @ManyToOne
    private FrameExtraction frameExtracted;

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

    public Collection<HoneyExtraction> getExtractions() {
        return extractions;
    }

    public void setExtractions(Collection<HoneyExtraction> extractions) {
        this.extractions = extractions;
    }

    public Opener getOpenFrame() {
        return openFrame;
    }

    public void setOpenFrame(Opener openFrame) {
        this.openFrame = openFrame;
    }

    public FrameExtraction getFrameExtracted() {
        return frameExtracted;
    }

    public void setFrameExtracted(FrameExtraction frameExtracted) {
        this.frameExtracted = frameExtracted;
    }
}
