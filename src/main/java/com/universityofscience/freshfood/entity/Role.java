package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "chucvu")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "machucvu")
	private long id;
	
	@Column(name = "tenchucvu")
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private Set<Employees> listEmployees;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Employees> getListEmployees() {
		return listEmployees;
	}

	public void setListEmployees(Set<Employees> listEmployees) {
		this.listEmployees = listEmployees;
	}
	
	
	
}
