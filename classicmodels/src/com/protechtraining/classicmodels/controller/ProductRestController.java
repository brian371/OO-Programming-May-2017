package com.protechtraining.classicmodels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protechtraining.classicmodels.dao.ProductDao;
import com.protechtraining.classicmodels.model.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController {
	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;

	@RequestMapping(method = RequestMethod.GET, 
					produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getProducts(@RequestParam(value="couponCode", required=false)
									 String couponCode) {
		return productDao.findAll(couponCode);
	}

}
