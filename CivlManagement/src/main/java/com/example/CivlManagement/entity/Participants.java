package com.example.CivlManagement.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "participant")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String investorCountryName;
    private String governmentRatio;
    private String governmentOffice;
    private String department;
    private String post;
    private String fullName;
    private int attribute;
    private String participantDetail;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestorCountryName() {
        return investorCountryName;
    }

    public void setInvestorCountryName(String investorCountryName) {
        this.investorCountryName = investorCountryName;
    }

    public String getGovernmentRatio() {
        return governmentRatio;
    }

    public void setGovernmentRatio(String governmentRatio) {
        this.governmentRatio = governmentRatio;
    }

    public String getGovernmentOffice() {
        return governmentOffice;
    }

    public void setGovernmentOffice(String governmentOffice) {
        this.governmentOffice = governmentOffice;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public String getParticipantDetail() {
        return participantDetail;
    }

    public void setParticipantDetail(String participantDetail) {
        this.participantDetail = participantDetail;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
