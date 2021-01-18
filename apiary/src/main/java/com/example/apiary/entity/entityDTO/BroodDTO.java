package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.WaxFoundation;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class BroodDTO {

    private Long id;
    private String type;
    private WaxFoundationDTO broodInWax;

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

    public WaxFoundationDTO getBroodInWax() {
        return broodInWax;
    }

    public void setBroodInWax(WaxFoundationDTO broodInWax) {
        this.broodInWax = broodInWax;
    }
}
