package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.Beekeeper;
import com.example.apiary.entity.Jenter;

public class PlugsDTO {

    private Long id;
    private boolean prepared;
    private BeekeeperDTO beekeeperInPlug;
    private JenterDTO jenter;

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

    public BeekeeperDTO getBeekeeperInPlug() {
        return beekeeperInPlug;
    }

    public void setBeekeeperInPlug(BeekeeperDTO beekeeperInPlug) {
        this.beekeeperInPlug = beekeeperInPlug;
    }

    public JenterDTO getJenter() {
        return jenter;
    }

    public void setJenter(JenterDTO jenter) {
        this.jenter = jenter;
    }
}
