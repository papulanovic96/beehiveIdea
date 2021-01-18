package com.example.apiary.entity.entityDTO;

import com.example.apiary.entity.Apiary;

public class MonthlyMaintenanceDTO {

    private Long id;
    private String monthName;
    private String workDescription;
    private ApiaryDTO monthInApiary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public ApiaryDTO getMonthInApiary() {
        return monthInApiary;
    }

    public void setMonthInApiary(ApiaryDTO monthInApiary) {
        this.monthInApiary = monthInApiary;
    }
}
