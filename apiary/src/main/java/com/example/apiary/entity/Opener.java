package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Opener {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String forkType;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "openFrame", cascade = CascadeType.ALL)
    private Collection<FrameOpening> openings;

    public String getForkType() {
        return forkType;
    }

    public void setForkType(String forkType) {
        this.forkType = forkType;
    }

    public Collection<FrameOpening> getOpenings() {
        return openings;
    }

    public void setOpenings(Collection<FrameOpening> openings) {
        this.openings = openings;
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
