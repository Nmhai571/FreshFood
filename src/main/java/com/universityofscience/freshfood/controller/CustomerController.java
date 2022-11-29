package com.universityofscience.freshfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.dto.CustomerDTO;
import com.universityofscience.freshfood.service.imp.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
@Autowired
private CustomerService customerService;
@PostMapping("/createcustomer")
public CustomerDTO save(@RequestBody CustomerDTO customerDTO)
{
	return customerService.addCustomer(customerDTO);
	}
@PostMapping("/updatecustomer/{id}")
public CustomerDTO save(@RequestBody CustomerDTO model,@PathVariable("id") long id)
{
	model.setCustomerId(id);
	return customerService.addCustomer(model);
	}
@PostMapping("/deleteCustomer")
public void deleteProduct(@RequestBody long[] ids) {
	customerService.delete(ids);;
}
}
