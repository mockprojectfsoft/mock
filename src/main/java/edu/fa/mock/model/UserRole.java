package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserRole implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private User employee;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;

	
	public UserRole(User employee, Role role) {
		super();
		this.employee = employee;
		this.role = role;
	}

	public User getEmployee() {
		return employee;
	}

	public void setAdmin(User employee) {
		this.employee = employee;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
