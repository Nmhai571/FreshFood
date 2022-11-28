package com.universityofscience.freshfood.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "loaicuahang")
public class StoreCategories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maloaicuahang")
	private long id;
	
	@Column(name = "tenloaicuahang")
	private String storeCategoryName;
	
	@OneToMany(mappedBy = "storeCategories")
	private Set<Store> lisStores;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStoreCategoryName() {
		return storeCategoryName;
	}

	public void setStoreCategoryName(String storeCategoryName) {
		this.storeCategoryName = storeCategoryName;
	}

	public Set<Store> getLisStores() {
		return lisStores;
	}

	public void setLisStores(Set<Store> lisStores) {
		this.lisStores = lisStores;
	}
	
	
}
