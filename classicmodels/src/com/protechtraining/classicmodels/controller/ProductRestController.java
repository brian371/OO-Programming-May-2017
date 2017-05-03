package com.protechtraining.classicmodels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.protechtraining.classicmodels.dao.ProductDao;
import com.protechtraining.classicmodels.model.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getProducts() {
		return productDao.findAll();
	}

}
