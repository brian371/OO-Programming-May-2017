package com.protechtraining.classicmodels.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.protechtraining.classicmodels.model.Product;

@Component()
public class ProductDaoMockImpl implements ProductDao {

	@Override
	public List<Product> findAll(String couponCode) {
		// TODO Auto-generated method stub
		return new ArrayList<Product>();
	}

}
