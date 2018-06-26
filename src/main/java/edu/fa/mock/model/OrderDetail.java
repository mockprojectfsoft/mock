package edu.fa.mock.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail implements Serializable{

	private float price;
	private int qty;
	private float amount;

	@Id
	@ManyToOne
	@JoinColumn(name="orderID")
	private Orders orders;
	
	@Id
	@ManyToOne
	@JoinColumn(name="productID")
	private Products product;

	public OrderDetail(float price, int qty, float amount, Orders orders, Products product) {
		super();
		this.price = price;
		this.qty = qty;
		this.amount = amount;
		this.orders = orders;
		this.product = product;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}
	
	
}
