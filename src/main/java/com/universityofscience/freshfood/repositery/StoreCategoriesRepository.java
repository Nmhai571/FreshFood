package com.universityofscience.freshfood.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universityofscience.freshfood.entity.StoreCategories;

@Repository
public interface StoreCategoriesRepository extends JpaRepository<StoreCategories, Long> {

}
