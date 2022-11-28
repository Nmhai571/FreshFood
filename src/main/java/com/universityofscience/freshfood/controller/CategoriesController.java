package com.universityofscience.freshfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.entity.Categories;
import com.universityofscience.freshfood.service.ICategoriesService;

@RestController
@RequestMapping("/api/v1")
public class CategoriesController {
	@Autowired
	ICategoriesService iCategoriesService;
	
	@PostMapping("/addcategory")
	public void addCategory(@RequestBody Categories categories) {
		iCategoriesService.addCategory(categories);
	}
	
	@PostMapping("/deletecategory")
	public String deleteCategory(long id) {
		iCategoriesService.deleteCategory(id);
		return "Thành Công";
	}
	
	@PostMapping("/getallcategories")
	public List<Categories> getAllCategories(){
		return iCategoriesService.getAllCategories();
	}
}
