package com.universityofscience.freshfood.service;

import java.util.List;

import com.universityofscience.freshfood.entity.StoreCategories;

public interface IStoreCategoryService {
	void addStoreCategory (StoreCategories storeCategories);
	void deleteStoreCategory(long id);
	List<StoreCategories> getAllStoreCategories();
}
