package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "sanpham")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masanpham")
	private long id;
	
	@Column(name = "tensanpham")
	private String productName;
	
	@Column(name = "ngaynhaphang")
	private String dayIn;
	
	@Column(name = "hansudung")
	private String expiryDay;
	
	@Column(name = "giatien")
	private String price;
	
//	@Column(name = "maloaisanpham")
//	private long idCategory;
	@ManyToOne
	@JoinColumn(name = "maloaisanpham")
	private Categories categories;
	
	@Column(name = "soluong")
	private long amount;
	
//	@Column(name = "macuahang")
//	private long idStore;
	@ManyToOne
	@JoinColumn(name = "macuahang")
	private Store store;
	
	@OneToMany(mappedBy = "product")
	private Set<BillDetail> lisBillDetails;
}
