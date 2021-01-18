package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "honey_extraction")
public class HoneyExtraction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private int roundNumber;
    @ManyToOne
    private Producer producerInE;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "extractions", cascade = CascadeType.ALL)
    private Collection<Packaging> packages;
    @ManyToOne
    private FrameOpening frameOpening;

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

    public Producer getProducerInE() {
        return producerInE;
    }

    public void setProducerInE(Producer producerInE) {
        this.producerInE = producerInE;
    }

    public Collection<Packaging> getPackages() {
        return packages;
    }

    public void setPackages(Collection<Packaging> packages) {
        this.packages = packages;
    }

    public FrameOpening getFrameOpening() {
        return frameOpening;
    }

    public void setFrameOpening(FrameOpening frameOpening) {
        this.frameOpening = frameOpening;
    }
}
