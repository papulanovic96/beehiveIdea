package com.example.apiary.entity.entityDTO;

import java.util.List;

public class ApiaryDTO {

    private Long id;
    private int beehiveNumber;
    private boolean state;
    private List<Long> beehivesDTO;
    private List<Long> monthlyMDTO;

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

    public List<Long> getBeehivesDTO() {
        return beehivesDTO;
    }

    public void setBeehivesDTO(List<Long> beehivesDTO) {
        this.beehivesDTO = beehivesDTO;
    }

    public List<Long> getMonthlyMDTO() {
        return monthlyMDTO;
    }

    public void setMonthlyMDTO(List<Long> monthlyMDTO) {
        this.monthlyMDTO = monthlyMDTO;
    }
}
