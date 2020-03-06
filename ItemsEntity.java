package com.cts.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;

import org.hibernate.annotations.OnDelete;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ItemsEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ShoppingCartEntity shoppingCart;
	
	private float itemprice;
	private String itemName;
	private String itemdescription;
	private int stockNumber;
	public String itemRemarks;
	 
	@ManyToOne(cascade = CascadeType.ALL)
	 private SellerEntity Seller;
	
	public ItemsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public float getPrice() {
		return itemprice;
	}
	public void setPrice(float itemprice) {
		this.itemprice = itemprice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return itemdescription;
	}
	public void setDescription(String description) {
		this.itemdescription = description;
	}
	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	public String getRemarks() {
		return itemRemarks;
	}
	public void setRemarks(String itemRemarks) {
		this.itemRemarks = itemRemarks;
	}
	
	public SellerEntity getSeller() {
		return Seller;
	}
	public void setSeller(SellerEntity seller) {
		Seller = seller;
	}
	@Override
	public String toString() {
		return "ItemsEntity [itemId=" + itemId + ", shoppingCart=" + shoppingCart + ", price=" + itemprice + ", itemName="
				+ itemName + ", description=" + itemdescription + ", stockNumber=" + stockNumber + ", remarks=" + itemRemarks
				+ ", Seller=" + Seller + "]";
	}
	public ItemsEntity(int itemId, ShoppingCartEntity shoppingCart, float itemprice, String itemName, String itemdescription,
			int stockNumber, String itemRemarks, SellerEntity seller) {
		super();
		this.itemId = itemId;
		this.shoppingCart = shoppingCart;
		this.itemprice = itemprice;
		this.itemName = itemName;
		this.itemdescription = itemdescription;
		this.stockNumber = stockNumber;
		this.itemRemarks = itemRemarks;
		Seller = seller;
	}
	
	
	
}
