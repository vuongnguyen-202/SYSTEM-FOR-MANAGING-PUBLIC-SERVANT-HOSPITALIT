package com.example.CivlManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Headquarter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String businessHeadquarter;
    private String businessHeadquarterCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessHeadquarter() {
        return businessHeadquarter;
    }

    public void setBusinessHeadquarter(String businessHeadquarter) {
        this.businessHeadquarter = businessHeadquarter;
    }

    public String getBusinessHeadquarterCode() {
        return businessHeadquarterCode;
    }

    public void setBusinessHeadquarterCode(String businessHeadquarterCode) {
        this.businessHeadquarterCode = businessHeadquarterCode;
    }
}
