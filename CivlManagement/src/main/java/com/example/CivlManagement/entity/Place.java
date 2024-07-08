package com.example.CivlManagement.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contentsOfHospitality;
    private LocalDate implementationDate;
    private double unitPriceYen;
    private String currency;
    private double unitPriceYenForeignCurrency;
    private double rate;
    private String remarks;
    private int numberPeopleOrQuantity;
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentsOfHospitality() {
        return contentsOfHospitality;
    }

    public void setContentsOfHospitality(String contentsOfHospitality) {
        this.contentsOfHospitality = contentsOfHospitality;
    }

    public LocalDate getImplementationDate() {
        return implementationDate;
    }

    public void setImplementationDate(LocalDate implementationDate) {
        this.implementationDate = implementationDate;
    }

    public double getUnitPriceYen() {
        return unitPriceYen;
    }

    public void setUnitPriceYen(double unitPriceYen) {
        this.unitPriceYen = unitPriceYen;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getUnitPriceYenForeignCurrency() {
        return unitPriceYenForeignCurrency;
    }

    public void setUnitPriceYenForeignCurrency(double unitPriceYenForeignCurrency) {
        this.unitPriceYenForeignCurrency = unitPriceYenForeignCurrency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getNumberPeopleOrQuantity() {
        return numberPeopleOrQuantity;
    }

    public void setNumberPeopleOrQuantity(int numberPeopleOrQuantity) {
        this.numberPeopleOrQuantity = numberPeopleOrQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
    // Getters, setters, and other methods
}
