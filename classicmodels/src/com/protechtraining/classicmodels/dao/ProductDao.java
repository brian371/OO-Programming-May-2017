package com.protechtraining.classicmodels.dao;

import java.util.List;

import com.protechtraining.classicmodels.model.Product;

public interface ProductDao {

	public abstract List<Product> findAll(String couponCode);

}