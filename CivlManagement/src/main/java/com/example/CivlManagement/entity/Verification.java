package com.example.CivlManagement.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "verification")
public class Verification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorizedReviewer;
    private String proxyReviewer;
    private String jobSys;

    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorizedReviewer() {
        return authorizedReviewer;
    }

    public void setAuthorizedReviewer(String authorizedReviewer) {
        this.authorizedReviewer = authorizedReviewer;
    }

    public String getProxyReviewer() {
        return proxyReviewer;
    }

    public void setProxyReviewer(String proxyReviewer) {
        this.proxyReviewer = proxyReviewer;
    }

    public String getJobSys() {
        return jobSys;
    }

    public void setJobSys(String jobSys) {
        this.jobSys = jobSys;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}