package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String extractorType;
    @Column
    private int frameNumber;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producerInE", cascade = CascadeType.ALL)
    private Collection<HoneyExtraction> extractions;

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

    public Collection<HoneyExtraction> getExtractions() {
        return extractions;
    }

    public void setExtractions(Collection<HoneyExtraction> extractions) {
        this.extractions = extractions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
