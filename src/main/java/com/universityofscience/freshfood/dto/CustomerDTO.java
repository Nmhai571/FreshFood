package com.universityofscience.freshfood.dto;

public class CustomerDTO {
private Long customerId;
private String customerName;
private String customerAddress;
private Long customerPhone;
public Long getCustomerId() {
	return customerId;
}
public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public Long getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(Long customerPhone) {
	this.customerPhone = customerPhone;
}

}
