package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "frame_extraction")
public class FrameExtraction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private int framesExtracted;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "frameExtracted", cascade = CascadeType.ALL)
    private Collection<FrameOpening> openings;
    @ManyToOne
    private Beekeeper beekeeperInFO;

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

    public Collection<FrameOpening> getOpenings() {
        return openings;
    }

    public void setOpenings(Collection<FrameOpening> openings) {
        this.openings = openings;
    }

    public Beekeeper getBeekeeperInFO() {
        return beekeeperInFO;
    }

    public void setBeekeeperInFO(Beekeeper beekeeperInFO) {
        this.beekeeperInFO = beekeeperInFO;
    }
}
