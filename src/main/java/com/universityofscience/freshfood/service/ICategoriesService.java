package com.universityofscience.freshfood.service;

import java.util.List;

import com.universityofscience.freshfood.entity.Categories;

public interface ICategoriesService {
	void addCategory(Categories categories);
	void deleteCategory(Long id);
	List<Categories> getAllCategories();
}
