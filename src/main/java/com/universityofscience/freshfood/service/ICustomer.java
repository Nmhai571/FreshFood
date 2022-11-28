package com.universityofscience.freshfood.service;

import com.universityofscience.freshfood.dto.CustomerDTO;

public interface ICustomer {
CustomerDTO addCustomer(CustomerDTO customerDTO);
void delete(long []ids);
}
