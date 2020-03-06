package com.cts.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TransactionEntity {
	@Id
	private int transactionId;
	private int buyerId;
	private String transactionType;
	private Date dateTime;
	private String tranRemarks;
	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getTranRemarks() {
		return tranRemarks;
	}
	public void setTranRemarks(String tranRemarks) {
		this.tranRemarks = tranRemarks;
	}
	public TransactionEntity(int transactionId, int buyerId, String transactionType, Date dateTime,
			String tranRemarks) {
		super();
		this.transactionId = transactionId;
		this.buyerId = buyerId;
		this.transactionType = transactionType;
		this.dateTime = dateTime;
		this.tranRemarks = tranRemarks;
	}
	@Override
	public String toString() {
		return "TransactionEntity [transactionId=" + transactionId + ", buyerId=" + buyerId + ", transactionType="
				+ transactionType + ", dateTime=" + dateTime + ", tranRemarks=" + tranRemarks + "]";
	}

	
}
