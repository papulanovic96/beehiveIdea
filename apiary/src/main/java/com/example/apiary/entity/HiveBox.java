package com.example.apiary.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "hive_box")
public class HiveBox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private int frameNumber;
    @Column
    private String color;
    @ManyToOne
    private Beehive boxInHive;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "frameInBox", cascade = CascadeType.ALL)
    private Collection<Frame> frame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Beehive getBoxInHive() {
        return boxInHive;
    }

    public void setBoxInHive(Beehive boxInHive) {
        this.boxInHive = boxInHive;
    }

    public Collection<Frame> getFrame() {
        return frame;
    }

    public void setFrame(Collection<Frame> frame) {
        this.frame = frame;
    }
}
