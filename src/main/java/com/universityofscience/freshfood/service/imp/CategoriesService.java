package com.universityofscience.freshfood.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.entity.Categories;
import com.universityofscience.freshfood.repositery.CategoriesRepository;
import com.universityofscience.freshfood.service.ICategoriesService;

@Service
public class CategoriesService implements ICategoriesService{
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Override
	public void addCategory(Categories categories) {
		 	
		categoriesRepository.save(categories);
	}

	@Override
	public void deleteCategory(Long id) {
		categoriesRepository.deleteById(id);
		
	}

	@Override
	public List<Categories> getAllCategories() {
		return categoriesRepository.findAll();
	}

}
