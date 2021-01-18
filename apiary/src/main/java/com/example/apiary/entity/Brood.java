package com.example.apiary.entity;

import javax.persistence.*;

@Entity
@Table(name = "brood")
public class Brood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String type;
    @ManyToOne
    private WaxFoundation broodInWax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WaxFoundation getBroodInWax() {
        return broodInWax;
    }

    public void setBroodInWax(WaxFoundation broodInWax) {
        this.broodInWax = broodInWax;
    }
}
