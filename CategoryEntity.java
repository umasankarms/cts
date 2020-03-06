package com.cts.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	@OneToMany(cascade = CascadeType.ALL,   mappedBy="catog")
	private List<SubCategoryEntity> subcat;
	
	private String categoryName;
	private String briefDetails;
	@Autowired
	@ManyToOne
	private SellerEntity sellerentity;
	
	public CategoryEntity() {
		
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryNmae(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getBriefDetails() {
		return briefDetails;
	}
	public void setBriefDetails(String briefDetails) {
		this.briefDetails = briefDetails;
	}
	public CategoryEntity(int categoryId, String categoryName, String briefDetails) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.briefDetails = briefDetails;
	}
	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + ", briefDetails="
				+ briefDetails + "]";
	}
	
	
}
