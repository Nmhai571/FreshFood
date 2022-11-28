package com.universityofscience.freshfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.entity.StoreCategories;
import com.universityofscience.freshfood.service.IStoreCategoryService;

@RestController
@RequestMapping("/api/v1")
public class StoreCategoryController {
	@Autowired
	IStoreCategoryService iStoreCategoryService;
	@PostMapping("/addstorecategory")
	public void addStoreCategory(@RequestBody StoreCategories storeCategories) {
		iStoreCategoryService.addStoreCategory(storeCategories);
	}
	
	@PostMapping("/deletestorecategory")
	public String deletestorecategory(long id) {
		iStoreCategoryService.deleteStoreCategory(id);
		return "Thành Công";
	}
	
	@PostMapping("/getallstorecategory")
	public List<StoreCategories> getAllStoreCategories(){
		return iStoreCategoryService.getAllStoreCategories();
	}
}
