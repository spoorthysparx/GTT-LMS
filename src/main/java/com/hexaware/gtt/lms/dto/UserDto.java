package com.hexaware.gtt.lms.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.hexaware.gtt.lms.entities.Tiers;

public class UserDto {

	private UUID uId;
    private long userId;
    private UUID partnerId;
    private UUID tierId;
    private Double totalPoints;
    private LocalDateTime expiry;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    

    public UUID getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(UUID partnerId) {
		this.partnerId = partnerId;
	}

	public UUID getTierId() {
		return tierId;
	}

	public void setTierId(UUID tierId) {
		this.tierId = tierId;
	}

	
    public Double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Double totalPoints) {
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
    
    
    
    
}