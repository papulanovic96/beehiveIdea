package com.example.apiary.entity;

import javax.persistence.*;

@Entity
@Table(name = "plugs")
public class Plugs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private boolean prepared;
    @ManyToOne
    private Beekeeper beekeeperInPlug;
    @ManyToOne
    private Jenter jenter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public Beekeeper getBeekeeperInPlug() {
        return beekeeperInPlug;
    }

    public void setBeekeeperInPlug(Beekeeper beekeeperInPlug) {
        this.beekeeperInPlug = beekeeperInPlug;
    }

    public Jenter getJenter() {
        return jenter;
    }

    public void setJenter(Jenter jenter) {
        this.jenter = jenter;
    }
}
