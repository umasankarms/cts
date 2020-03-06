package com.cts.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class DiscountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int discountId;
	private int discountCode;
	private float discountpercentage;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	//@Temporal(TemporalType.TIMESTAMP)
	private String discountdescription;
	
	public DiscountEntity() {
		
	}
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public int getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(int discountCode) {
		this.discountCode = discountCode;
	}
	public float getPercentage() {
		return discountpercentage;
	}
	public void setPercentage(float discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return discountdescription;
	}
	public void setDescription(String discountdescription) {
		this.discountdescription = discountdescription;
	}
	public DiscountEntity(int discountId, int discountCode, float percentage, Date startDate, Date endDate,
			String description) {
		super();
		this.discountId = discountId;
		this.discountCode = discountCode;
		this.discountpercentage = discountpercentage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountdescription = discountdescription;
	}
	@Override
	public String toString() {
		return "DiscountEntity [discountId=" + discountId + ", discountCode=" + discountCode + ", percentage="
				+ discountpercentage + ", startDate=" + startDate + ", endDate=" + endDate + ", discountdescription=" + discountdescription
				+ "]";
	}
	
	
	
}
