package com.example.CivlManagement.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ApplicationId;
    private String applicationType;
    private LocalDate applicationDate;
    private LocalDate approvalDate;
    private String applicationSupervisingDepartment;
    private String applicationRoomAddressCode;
    private String affiliatedCompanyCode;
    private String mainOffice;
    private String veriPreset;
    private String manager;
    private String affiliatedCompanyName;
    private LocalDate scheduledImplementationDateFrom;
    private LocalDate scheduledImplementationDateTo;
    private String ifInclusive;
    private String projectCountry;
    private String projectTitle;
    private boolean odaProject;
    private String countryName;
    private String nameCity;
    private int numberOfPeople;
    private int numberOfPeopleOurCompany;
    private int numberOfPeopleOther;
    private double foreignTotal;
    private double totalYen;

    public Long getApplicationId() {
        return ApplicationId;
    }

    public void setApplicationId(Long applicationId) {
        ApplicationId = applicationId;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getApplicationSupervisingDepartment() {
        return applicationSupervisingDepartment;
    }

    public void setApplicationSupervisingDepartment(String applicationSupervisingDepartment) {
        this.applicationSupervisingDepartment = applicationSupervisingDepartment;
    }

    public String getApplicationRoomAddressCode() {
        return applicationRoomAddressCode;
    }

    public void setApplicationRoomAddressCode(String applicationRoomAddressCode) {
        this.applicationRoomAddressCode = applicationRoomAddressCode;
    }

    public String getAffiliatedCompanyCode() {
        return affiliatedCompanyCode;
    }

    public void setAffiliatedCompanyCode(String affiliatedCompanyCode) {
        this.affiliatedCompanyCode = affiliatedCompanyCode;
    }

    public String getMainOffice() {
        return mainOffice;
    }

    public void setMainOffice(String mainOffice) {
        this.mainOffice = mainOffice;
    }

    public String getVeriPreset() {
        return veriPreset;
    }

    public void setVeriPreset(String veriPreset) {
        this.veriPreset = veriPreset;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAffiliatedCompanyName() {
        return affiliatedCompanyName;
    }

    public void setAffiliatedCompanyName(String affiliatedCompanyName) {
        this.affiliatedCompanyName = affiliatedCompanyName;
    }

    public LocalDate getScheduledImplementationDateFrom() {
        return scheduledImplementationDateFrom;
    }

    public void setScheduledImplementationDateFrom(LocalDate scheduledImplementationDateFrom) {
        this.scheduledImplementationDateFrom = scheduledImplementationDateFrom;
    }

    public LocalDate getScheduledImplementationDateTo() {
        return scheduledImplementationDateTo;
    }

    public void setScheduledImplementationDateTo(LocalDate scheduledImplementationDateTo) {
        this.scheduledImplementationDateTo = scheduledImplementationDateTo;
    }

    public String getIfInclusive() {
        return ifInclusive;
    }

    public void setIfInclusive(String ifInclusive) {
        this.ifInclusive = ifInclusive;
    }

    public String getProjectCountry() {
        return projectCountry;
    }

    public void setProjectCountry(String projectCountry) {
        this.projectCountry = projectCountry;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public boolean isOdaProject() {
        return odaProject;
    }

    public void setOdaProject(boolean odaProject) {
        this.odaProject = odaProject;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeopleOurCompany() {
        return numberOfPeopleOurCompany;
    }

    public void setNumberOfPeopleOurCompany(int numberOfPeopleOurCompany) {
        this.numberOfPeopleOurCompany = numberOfPeopleOurCompany;
    }

    public int getNumberOfPeopleOther() {
        return numberOfPeopleOther;
    }

    public void setNumberOfPeopleOther(int numberOfPeopleOther) {
        this.numberOfPeopleOther = numberOfPeopleOther;
    }

    public double getForeignTotal() {
        return foreignTotal;
    }

    public void setForeignTotal(double foreignTotal) {
        this.foreignTotal = foreignTotal;
    }

    public double getTotalYen() {
        return totalYen;
    }

    public void setTotalYen(double totalYen) {
        this.totalYen = totalYen;
    }
}