package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityofscience.freshfood.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
	Store findOneBystoreName(String storeName);
}
