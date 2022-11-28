package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityofscience.freshfood.dto.CustomerDTO;
import com.universityofscience.freshfood.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Long>{
	Customer findOneBycustomerId(Long makhachhang);
	 void deleteBycustomerId(Long makhachhang);
}
