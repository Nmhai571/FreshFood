package com.universityofscience.freshfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.dto.ProductDTO;
import com.universityofscience.freshfood.entity.Product;
import com.universityofscience.freshfood.service.IProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
@Autowired
private IProductService productService;
@GetMapping("/test")
public List<Product> findAll()
{
	return productService.findAll();
	}
@PostMapping("/addproduct")
public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
	return productService.save(productDTO);
	
}

@PostMapping("/updateproduct/{id}")
public ProductDTO updateProduct(@RequestBody ProductDTO model, @PathVariable("id") long id) {
	model.setProductId(id);
	return productService.save(model);
}

@PostMapping("/deleteproduct")
public void deleteProduct(@RequestBody long[] ids) {
	productService.delete(ids);;
}
}
