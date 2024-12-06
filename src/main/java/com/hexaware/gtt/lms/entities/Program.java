package com.hexaware.gtt.lms.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Program {
	@Id
	@GeneratedValue
	private UUID programId;
	private String programName;
	private boolean status;

	@ElementCollection
//	@CollectionTable(name = "program_coupons", joinColumns = @JoinColumn(name = "program_id"))
	@OneToMany(mappedBy="program", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Coupons> coupons;
//	@CollectionTable(name = "program_offers", joinColumns = @JoinColumn(name = "program_id"))
	@OneToMany(mappedBy="program", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Offers> offers;


	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Program(UUID programId, String programName, boolean status, List<Coupons> coupons, List<Offers> offers) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.status = status;
		this.coupons = coupons;
		this.offers = offers;
	}

	public UUID getProgramId() {
		return programId;
	}

	public void setProgramId(UUID programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Coupons> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupons> coupons) {
		this.coupons = coupons;
	}

	public List<Offers> getOffers() {
		return offers;
	}

	public void setOffers(List<Offers> offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "Program [programId=" + programId + ", programName=" + programName + ", status=" + status + ", coupons="
				+ coupons + ", offers=" + offers + "]";
	}

}
