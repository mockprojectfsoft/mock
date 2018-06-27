package edu.fa.mock.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float totalAmount;
	private int status;
	private String dateCreate;
	private String shippingAdress;
	private String shipDate;
	
	@ManyToOne
	@JoinColumn(name="employeeId")
	private User employees;
	
	@ManyToOne
	@JoinColumn(name="customerID")
	private Customer customer;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(float totalAmount, int status, String dateCreate, Customer customer) {
		super();
		this.totalAmount = totalAmount;
		this.status = status;
		this.dateCreate = dateCreate;
		this.customer = customer;
	}

	public Orders(int id, float totalAmount, int status, String dateCreate, Customer customer) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.status = status;
		this.dateCreate = dateCreate;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getShippingAdress() {
		return shippingAdress;
	}

	public void setShippingAdress(String shippingAdress) {
		this.shippingAdress = shippingAdress;
	}

	public User getEmployees() {
		return employees;
	}

	public void setEmployees(User employees) {
		this.employees = employees;
	}
	
	
}
