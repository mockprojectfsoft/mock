package edu.fa.mock.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String images;
	private float price;
	private float discount;
	private float instock;
	private int sold;
	private String description;
	private String content;
	private String dateCreate;
	private String dateUpdate;
	
	@ManyToOne
	@JoinColumn(name="categoryID")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="manufacturerID")
	private Manufacturer manufacturer;
	
	public Products() {
		super();
	}
	public Products(String name, String images, String imageList, float price, float discount,
			float instock, int sold, String description, String content, String dateCreate, String dateUpdate) {
		super();
		this.name = name;
		this.images = images;
		this.price = price;
		this.discount = discount;
		this.instock = instock;
		this.sold = sold;
		this.description = description;
		this.content = content;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
	}
	public Products(int id, String name, String images, String imageList, float price,
			float discount, float instock, int sold, String description, String content, String dateCreate,
			String dateUpdate) {
		super();
		this.id = id;
		this.name = name;
		this.images = images;
		this.price = price;
		this.discount = discount;
		this.instock = instock;
		this.sold = sold;
		this.description = description;
		this.content = content;
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
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getInstock() {
		return instock;
	}
	public void setInstock(float instock) {
		this.instock = instock;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	
	
}
