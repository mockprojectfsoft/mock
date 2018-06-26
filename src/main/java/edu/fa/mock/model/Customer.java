package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String username;
	private String fullName;
	private String birthDay;
	private int gender;
	private String address;
	private String phone;
	private String dateCreate;
	private String dateUpdate;
	
	@OneToMany(mappedBy="customer")
	List<Orders> oders;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String email, String password, String username, String fullName, String birthDay, int gender,
			String address, String phone, String dateCreate, String dateUpdate) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
	}
	public Customer(int id, String email, String password, String username, String fullName, String birthDay,
			int gender, String address, String phone, String dateCreate, String dateUpdate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.dateCreate = dateCreate;
		this.dateUpdate = dateUpdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
