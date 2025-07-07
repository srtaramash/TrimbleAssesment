package com.example.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CarOwner {
	
	@Id
	@GeneratedValue
	private long ownerId;
	private String ownerName;
	private String brand;
	private String model;
	private double leaseamount;
	private boolean availableCars;
	private boolean onLease;
	private boolean onService;
	/**
	 * @return the ownerId
	 */
	public long getOwnerId() {
		return ownerId;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the leaseamount
	 */
	public double getLeaseamount() {
		return leaseamount;
	}
	/**
	 * @return the availableCars
	 */
	public boolean isAvailableCars() {
		return availableCars;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @param leaseamount the leaseamount to set
	 */
	public void setLeaseamount(double leaseamount) {
		this.leaseamount = leaseamount;
	}
	
	
	/**
	 * @return the onLease
	 */
	public boolean isOnLease() {
		return onLease;
	}
	/**
	 * @return the onService
	 */
	public boolean isOnService() {
		return onService;
	}
	/**
	 * @param onLease the onLease to set
	 */
	public void setOnLease(boolean onLease) {
		this.onLease = onLease;
	}
	/**
	 * @param onService the onService to set
	 */
	public void setOnService(boolean onService) {
		this.onService = onService;
	}
	
	/**
	 * @param availableCars the availableCars to set
	 */
	public void setAvailableCars(boolean availableCars) {
		this.availableCars = availableCars;
	}
	public CarOwner(long ownerId, String ownerName, String brand, String model, double leaseamount,
			boolean availableCars) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.brand = brand;
		this.model = model;
		this.leaseamount = leaseamount;
		this.availableCars = availableCars;
	}
	public CarOwner(boolean onLease, boolean onService) {
		super();
		this.onLease = onLease;
		this.onService = onService;
	}
	
	
	
	
	
	

}
