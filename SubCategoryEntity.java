package com.cts.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subcategoryId;
	private String subcategoryName;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CategoryEntity catog;
	
	
	//private CategoryEntity categoryId;
	private String briefDetails;
	
	
	
	
	public SubCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	
	public String getBriefDetails() {
		return briefDetails;
	}
	public void setBriefDetails(String briefDetails) {
		this.briefDetails = briefDetails;
	}
	public SubCategoryEntity(int subcategoryId, String subcategoryName, CategoryEntity categoryId, String briefDetails) {
		super();
		this.subcategoryId = subcategoryId;
		this.subcategoryName = subcategoryName;
		//this.categoryId = categoryId;
		this.briefDetails = briefDetails;
	}
	@Override
	public String toString() {
		return "SubCategoryEntity [subcategoryId=" + subcategoryId + ", subcategoryName=" + subcategoryName
				+  ", briefDetails=" + briefDetails + "]";
	}
	
	
	
}
