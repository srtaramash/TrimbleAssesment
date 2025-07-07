package com.example.assessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EndCustomer {
	
	@Id
	@GeneratedValue
	private long customerId;
	private String customerName;
	private String brand;
	private String model;
	private double leaseamount;
	private double leaseStatus;
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
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
	 * @return the leaseStatus
	 */
	public double getLeaseStatus() {
		return leaseStatus;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	 * @param leaseStatus the leaseStatus to set
	 */
	public void setLeaseStatus(double leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	public EndCustomer(long customerId, String customerName, String brand, String model, double leaseamount,
			double leaseStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.brand = brand;
		this.model = model;
		this.leaseamount = leaseamount;
		this.leaseStatus = leaseStatus;
	}
	
	
	
	

}
