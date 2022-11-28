package com.universityofscience.freshfood.service;

import java.util.List;

import com.universityofscience.freshfood.dto.ProductDTO;
import com.universityofscience.freshfood.entity.Product;

public interface IProductService {
	ProductDTO save(ProductDTO productDTO);
	void delete(long []ids);
	List<Product> findAll();

}
