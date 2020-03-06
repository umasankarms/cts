package com.cts.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class BuyerEntity  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="buyer_id")
	private int buyerId;
	private String userName;
	private String password;
	private String email;
	private long mobileNumber;
	private String createDateItem;
	private int itemId;
	
	public BuyerEntity() {
	
	}
	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	 
	public String getCreateDateItem() {
		return createDateItem;
	}

	public void setCreateDateItem(String createDateItem) {
		this.createDateItem = createDateItem;
	}

	public BuyerEntity(int buyerId, String userName, String password, String email, long mobileNumber,
			String createDateItem) {
		
		super();
		this.buyerId = buyerId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.createDateItem = createDateItem;
	}

	@Override
	public String toString() {
		return "BuyerEntity [buyerId=" + buyerId + ", userName=" + userName + ", password=" + password + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", createDateItem=" + createDateItem + "]";
	}

	
	

	
	
	

}
