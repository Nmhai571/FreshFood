package com.universityofscience.freshfood.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.entity.StoreCategories;
import com.universityofscience.freshfood.repositery.StoreCategoriesRepository;
import com.universityofscience.freshfood.service.IStoreCategoryService;

@Service
public class StoreCategoriesService implements IStoreCategoryService {
	@Autowired
	StoreCategoriesRepository storeCategoriesRepository;
	@Override
	public void addStoreCategory(StoreCategories storeCategories) {
		storeCategoriesRepository.save(storeCategories);
	}
	@Override
	public void deleteStoreCategory(long id) {
		storeCategoriesRepository.deleteById(id);
		
	}
	@Override
	public List<StoreCategories> getAllStoreCategories() {
		return storeCategoriesRepository.findAll();
	}

}
