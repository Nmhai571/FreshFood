package com.universityofscience.freshfood.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.convert.CustomerConvert;
import com.universityofscience.freshfood.dto.CustomerDTO;
import com.universityofscience.freshfood.entity.Customer;
import com.universityofscience.freshfood.repositery.CustomerRespository;
import com.universityofscience.freshfood.service.ICustomer;
@Service
public class CustomerService implements ICustomer {
@Autowired 
private CustomerRespository customerRespository;
@Autowired
private CustomerConvert customerConvert;
	@Override
	public CustomerDTO addCustomer(CustomerDTO customerDTO) {
		Customer customer=new Customer();
		if(customerDTO.getCustomerId() != null)
		{
			Customer customerOldId=customerRespository.findOneBycustomerId(customerDTO.getCustomerId());
			customer= customerConvert.toEntity(customerOldId, customerDTO);
		}
		else {
			customer= customerConvert.toEntity(customerDTO);
		}
		customer=customerRespository.save(customer);
		return customerConvert.toDTO(customer);
	}
	@Override
	public void delete(long[] ids) {
		for (long i : ids) {
			customerRespository.deleteById(i);;
		}
	}
	
}
