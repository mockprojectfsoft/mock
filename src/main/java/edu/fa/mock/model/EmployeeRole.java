package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeRole implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee admin;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;

	
	public EmployeeRole(Employee admin, Role role) {
		super();
		this.admin = admin;
		this.role = role;
	}

	public Employee getAdmin() {
		return admin;
	}

	public void setAdmin(Employee admin) {
		this.admin = admin;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
