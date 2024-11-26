package com.hexaware.gtt.lms.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID partnerId;

    private String partnerName;
    private String email;
    private String password;

    @Column(updatable = false)
    private final LocalDateTime dateJoined = LocalDateTime.now();

    private boolean status;  


    public UUID getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(UUID partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateJoined() {
        return dateJoined;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
