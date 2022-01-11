package com.te.onetomanymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Items {
	@Id
	private int noOfItems;
	private int price;
	
	@ManyToOne
	private Cart cart;

	public Items(int noOfItems, int price, Cart cart) {
		super();
		this.noOfItems = noOfItems;
		this.price = price;
		this.cart = cart;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
