package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "jenter")
public class Jenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private boolean jenterTable;
    @Column
    private int carrier;
    @Column
    private int stemCell;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jenter", cascade = CascadeType.ALL)
    private Collection<Plugs> plugs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isJenterTable() {
        return jenterTable;
    }

    public void setJenterTable(boolean jenterTable) {
        this.jenterTable = jenterTable;
    }

    public int getCarrier() {
        return carrier;
    }

    public void setCarrier(int carrier) {
        this.carrier = carrier;
    }

    public int getStemCell() {
        return stemCell;
    }

    public void setStemCell(int stemCell) {
        this.stemCell = stemCell;
    }

    public Collection<Plugs> getPlugs() {
        return plugs;
    }

    public void setPlugs(Collection<Plugs> plugs) {
        this.plugs = plugs;
    }
}
