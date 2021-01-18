package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "packaging")
public class Packaging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private boolean filled;
    @Column
    private int volume;
    @ManyToMany
    @JoinTable(
            name = "extractionPackage",
            joinColumns = @JoinColumn(name = "idPackage", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idHoney", referencedColumnName = "id"))
    private Collection<HoneyExtraction> extractions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Collection<HoneyExtraction> getExtractions() {
        return extractions;
    }

    public void setExtractions(Collection<HoneyExtraction> extractions) {
        this.extractions = extractions;
    }
}
