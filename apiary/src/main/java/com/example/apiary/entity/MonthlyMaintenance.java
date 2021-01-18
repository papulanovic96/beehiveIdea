package com.example.apiary.entity;

import javax.persistence.*;

@Entity
@Table(name = "monthly_maintenance")
public class MonthlyMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column
    private String monthName;
    @Column
    private String workDescription;
    @ManyToOne
    private Apiary monthInApiary;

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

    public Apiary getMonthInApiary() {
        return monthInApiary;
    }

    public void setMonthInApiary(Apiary monthInApiary) {
        this.monthInApiary = monthInApiary;
    }
}
