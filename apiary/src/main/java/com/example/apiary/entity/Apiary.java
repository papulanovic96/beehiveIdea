package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "apiary")
public class Apiary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private int beehiveNumber;
    @Column
    private boolean state;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hiveInApiary", cascade = CascadeType.PERSIST)
    private Collection<Beehive> beehives;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "monthInApiary", cascade = CascadeType.ALL)
    private Collection<MonthlyMaintenance> maintenance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBeehiveNumber() {
        return beehiveNumber;
    }

    public void setBeehiveNumber(int beehiveNumber) {
        this.beehiveNumber = beehiveNumber;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Collection<Beehive> getBeehives() {
        return beehives;
    }

    public void setBeehives(Collection<Beehive> beehives) {
        this.beehives = beehives;
    }

    public Collection<MonthlyMaintenance> getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Collection<MonthlyMaintenance> maintenance) {
        this.maintenance = maintenance;
    }
}
