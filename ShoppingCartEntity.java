package com.cts.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ShoppingCartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	//@OneToMany//(cascade = CascadeType.ALL, mappedBy = "shoppingCart")
	//private List<ItemsEntity> itemsEntity;
	
	@ManyToOne
	@JoinColumn(name="buyer_id")
	private BuyerEntity buyer;
	
	public BuyerEntity getBuyer() {
		return buyer;
	}
	public void setBuyer(BuyerEntity buyer) {
		this.buyer = buyer;
	}
	
	
	private int quantity;
	private float price;
	private String description;
	public ShoppingCartEntity() {
		super();
		
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "ShoppingCartEntity [cartId=" + cartId + ", buyer=" + buyer + ", quantity=" + quantity + ", price="
				+ price + ", description=" + description + "]";
	}
	public ShoppingCartEntity(int cartId, BuyerEntity buyer, int quantity, float price, String description) {
		super();
		this.cartId = cartId;
		this.buyer = buyer;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	

	
}
