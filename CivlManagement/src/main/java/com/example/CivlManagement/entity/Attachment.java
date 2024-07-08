package com.example.CivlManagement.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "attachment")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String attachmentDec;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttachmentDec() {
        return attachmentDec;
    }

    public void setAttachmentDec(String attachmentDec) {
        this.attachmentDec = attachmentDec;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
    // Getters, setters, and other methods
}

