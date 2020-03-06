package com.cts.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PurchaseHistoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	private int buyerId;
	private int transactionId;
	private int itemId;
	private int numberOfItems;
	private Date dateItme;
	private String purchaseremarks;
	
	public PurchaseHistoryEntity() {
		
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public Date getDateItme() {
		return dateItme;
	}
	public void setDateItme(Date dateItme) {
		this.dateItme = dateItme;
	}
	public String getPurchaseremarks() {
		return purchaseremarks;
	}
	public void setPurchremarks(String purchremarks) {
		this.purchaseremarks = purchaseremarks;
	}
	public PurchaseHistoryEntity(int purchaseId, int buyerId, int transactionId, int itemId, int numberOfItems,
			Date dateItme, String purchremarks) {
		super();
		this.purchaseId = purchaseId;
		this.buyerId = buyerId;
		this.transactionId = transactionId;
		this.itemId = itemId;
		this.numberOfItems = numberOfItems;
		this.dateItme = dateItme;
		this.purchaseremarks = purchaseremarks;
	}
	@Override
	public String toString() {
		return "PurchaseHistoryEntity [purchaseId=" + purchaseId + ", buyerId=" + buyerId + ", transactionId="
				+ transactionId + ", itemId=" + itemId + ", numberOfItems=" + numberOfItems + ", dateItme=" + dateItme
				+ ", purchaseremarks=" + purchaseremarks + "]";
	}
	
	
	
}
