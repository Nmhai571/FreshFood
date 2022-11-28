package com.universityofscience.freshfood.convert;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.dto.CustomerDTO;
import com.universityofscience.freshfood.entity.Customer;

@Component
public class CustomerConvert {
	public CustomerDTO toDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerAddress(customer.getAddress());
		customerDTO.setCustomerName(customer.getCustomerName());
		customerDTO.setCustomerPhone(customer.getPhoneNumber());

		return customerDTO;
	}

	public Customer toEntity(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setAddress(customerDTO.getCustomerAddress());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setPhoneNumber(customerDTO.getCustomerPhone());
		return customer;
	}

	public Customer toEntity(Customer customer, CustomerDTO dto) {
		customer.setAddress(dto.getCustomerAddress());
		customer.setCustomerName(dto.getCustomerName());
		customer.setPhoneNumber(dto.getCustomerPhone());

		return customer;
	}
}
