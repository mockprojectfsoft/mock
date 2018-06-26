package edu.fa.mock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AdminRole implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "adminId")
	private Admin admin;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;

	
	public AdminRole(Admin admin, Role role) {
		super();
		this.admin = admin;
		this.role = role;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
