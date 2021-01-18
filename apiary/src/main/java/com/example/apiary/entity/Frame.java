package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "frame")
public class Frame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String type;
    @Column
    private boolean capacity;
    @ManyToOne
    private HiveBox frameInBox;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "waxInFrame", cascade = CascadeType.ALL)
    private Collection<WaxFoundation> waxFoundation;

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

    public boolean isCapacity() {
        return capacity;
    }

    public void setCapacity(boolean capacity) {
        this.capacity = capacity;
    }

    public HiveBox getFrameInBox() {
        return frameInBox;
    }

    public void setFrameInBox(HiveBox frameInBox) {
        this.frameInBox = frameInBox;
    }

    public Collection<WaxFoundation> getWaxFoundation() {
        return waxFoundation;
    }

    public void setWaxFoundation(Collection<WaxFoundation> waxFoundation) {
        this.waxFoundation = waxFoundation;
    }
}
