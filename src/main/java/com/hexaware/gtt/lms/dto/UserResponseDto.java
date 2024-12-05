package com.hexaware.gtt.lms.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.Tiers;

public class UserResponseDto {

	private UUID uId;
    private long userId;
    private Tiers tiers;
   // private Partner partners;
    private int totalPoints;
    private LocalDateTime expiry;

    private QuitQResponseDto quitQResponseDto;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

	public Tiers getTiers() {
		return tiers;
	}

	public void setTiers(Tiers tiers) {
		this.tiers = tiers;
	}

	public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }

	public UUID getuId() {
		return uId;
	}

	public void setuId(UUID uId) {
		this.uId = uId;
	}

	// public Partner getPartners() {
	// 	return partners;
	// }

	// public void setPartners(Partner partners) {
	// 	this.partners = partners;
	// }

    public QuitQResponseDto getQuitQResponseDto() {
        return quitQResponseDto;
    }

    public void setQuitQResponseDto(QuitQResponseDto quitQResponseDto) {
        this.quitQResponseDto = quitQResponseDto;
    }
	
	
    
}
