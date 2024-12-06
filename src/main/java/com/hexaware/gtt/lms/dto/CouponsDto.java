package com.hexaware.gtt.lms.dto;
 
import java.util.UUID;
 
import com.hexaware.gtt.lms.entities.Tiers;
 
public class CouponsDto {
	
	private UUID couponId;
    private UUID tierId;
    private UUID programId;
	private String couponTitle;
	private String couponDescription;
	private int validity;
	private double maxLimit;
	private double percentage;
 
	private boolean status;
 
    
   
	public CouponsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CouponsDto(UUID couponId, UUID tierId, UUID programId, String couponTitle, String couponDescription,
			int validity, double maxLimit, double percentage, boolean status) {
		super();
		this.couponId = couponId;
		this.tierId = tierId;
		this.programId = programId;
		this.couponTitle = couponTitle;
		this.couponDescription = couponDescription;
		this.validity = validity;
		this.maxLimit = maxLimit;
		this.percentage = percentage;
		this.status = status;
	}

	public String getCouponTitle() {
        return couponTitle;
    }
 
    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }
 
    public String getCouponDescription() {
        return couponDescription;
    }
 
    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
    }
 
    public int getValidity() {
        return validity;
    }
 
    public void setValidity(int validity) {
        this.validity = validity;
    }
 
    public boolean isStatus() {
        return status;
    }
 
    public void setStatus(boolean status) {
        this.status = status;
    }
 
	public UUID getCouponId() {
		return couponId;
	}
 
	public void setCouponId(UUID couponId) {
		this.couponId = couponId;
	}
 
	public UUID getTierId() {
		return tierId;
	}
 
	public void setTierId(UUID tierId) {
		this.tierId = tierId;
	}
 
	public double getMaxLimit() {
		return maxLimit;
	}
 
	public void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}
 
	public double getPercentage() {
		return percentage;
	}
 
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public UUID getProgramId() {
		return programId;
	}

	public void setProgramId(UUID programId) {
		this.programId = programId;
	}

	@Override
	public String toString() {
		return "CouponsDto [couponId=" + couponId + ", tierId=" + tierId + ", programId=" + programId + ", couponTitle="
				+ couponTitle + ", couponDescription=" + couponDescription + ", validity=" + validity + ", maxLimit="
				+ maxLimit + ", percentage=" + percentage + ", status=" + status + "]";
	}
	
	
	
 
}
 
 