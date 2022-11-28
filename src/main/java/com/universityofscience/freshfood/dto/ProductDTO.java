package com.universityofscience.freshfood.dto;

public class ProductDTO {
private Long productId;
private String productName;
private String importDate;
private String expiryDate;
private String price;
private long amount;
private String storeName;
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
private  String productTypeName;

public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public void setProductId(Long productId) {
	this.productId = productId;
}


public String getImportDate() {
	return importDate;
}
public void setImportDate(String importDate) {
	this.importDate = importDate;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}

public String getProductTypeName() {
	return productTypeName;
}
public void setProductTypeName(String productTypeName) {
	this.productTypeName = productTypeName;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}

public Long getProductId() {
	return productId;
}

}
