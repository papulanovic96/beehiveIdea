package com.example.apiary.entity.entityDTO;

import java.util.List;

public class JenterDTO {

    private Long id;
    private boolean jenterTable;
    private int carrier;
    private int stemCell;
    private List<Long> plugs;
    private ActivityCalendarDTO jenterAC;

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

    public List<Long> getPlugs() {
        return plugs;
    }

    public void setPlugs(List<Long> plugs) {
        this.plugs = plugs;
    }

    public ActivityCalendarDTO getJenterAC() {
        return jenterAC;
    }

    public void setJenterAC(ActivityCalendarDTO jenterAC) {
        this.jenterAC = jenterAC;
    }
}
