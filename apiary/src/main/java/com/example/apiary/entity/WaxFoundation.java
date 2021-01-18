package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "wax_foundation")
public class WaxFoundation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String foundationState;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "broodInWax", cascade = CascadeType.ALL)
    private Collection<Brood> brood;
    @ManyToOne
    private Frame waxInFrame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoundationState() {
        return foundationState;
    }

    public void setFoundationState(String foundationState) {
        this.foundationState = foundationState;
    }

    public Collection<Brood> getBrood() {
        return brood;
    }

    public void setBrood(Collection<Brood> brood) {
        this.brood = brood;
    }

    public Frame getWaxInFrame() {
        return waxInFrame;
    }

    public void setWaxInFrame(Frame waxInFrame) {
        this.waxInFrame = waxInFrame;
    }
}
