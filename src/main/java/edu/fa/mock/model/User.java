package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String username;
	
	@OneToMany(mappedBy="employee")
	private List<UserRole> employeeRole;
	
	@OneToMany(mappedBy="employees")
	private List<Orders> orders;
	
	
	public User(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public User(int id, String email, String password, String username) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<UserRole> getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(List<UserRole> employeeRole) {
		this.employeeRole = employeeRole;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
}
