package com.cts.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
@Entity
public class SellerEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sellerId;
	//@NotNull
	private String sellerName;
	//@NotNull
	private String password;
	//@NotNull
	private String companyName;
	
	private String gstin;
	//@NotNull
	private String briefaboutCompany;
	private String postal_Address;

	private String website;
	
	private String emailid;
	
	
	private long contactNumber;
	
	
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public String getBriefaboutCompany() {
		return briefaboutCompany;
	}
	public void setBriefaboutCompany(String briefaboutCompany) {
		this.briefaboutCompany = briefaboutCompany;
	}
	public String getPostal_Address() {
		return postal_Address;
	}
	public void setPostal_Address(String postal_Address) {
		this.postal_Address = postal_Address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber (int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public SellerEntity(int sellerId, String sellerName, String password, String companyName, String gstin,
			String briefaboutCompany, String postal_Address, String website, String emailid, long contactNumber) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.password = password;
		this.companyName = companyName;
		this.gstin = gstin;
		this.briefaboutCompany = briefaboutCompany;
		this.postal_Address = postal_Address;
		this.website = website;
		this.emailid = emailid;
		this.contactNumber = contactNumber;
	}
	public SellerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SellerEntity [sellerId=" + sellerId + ", sellerName=" + sellerName + ", password=" + password
				+ ", companyName=" + companyName + ", gstin=" + gstin + ", briefaboutCompany=" + briefaboutCompany
				+ ", postal_Address=" + postal_Address + ", website=" + website + ", emailid=" + emailid
				+ ", contactNumber=" + contactNumber + "]";
	}

}
	