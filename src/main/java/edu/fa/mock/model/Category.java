package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dateCreate;
	private String dateUpdate;
	
	@OneToMany(mappedBy="category")
	private List<Products> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Category(String name, String dateCreate, String dateUpdate) {
		super();
		this.name = name;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
	}
	
	public Category(int id, String name, String dateCreate, String dateUpdate) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
}
