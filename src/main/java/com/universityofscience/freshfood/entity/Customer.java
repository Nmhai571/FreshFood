package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "khachhang")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makhachhang")
	private Long customerId;
	
	@Column(name = "tenkhachhang")
	private String customerName;
	
	@Column(name = "diachi")
	private String address;
	
	@Column(name = "sodienthoai")
	private Long phoneNumber;
	
	public Long getId() {
		return customerId;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Bill> getLisBills() {
		return lisBills;
	}

	public void setLisBills(Set<Bill> lisBills) {
		this.lisBills = lisBills;
	}

	@OneToMany(mappedBy = "customer")
	private Set<Bill> lisBills;
}
