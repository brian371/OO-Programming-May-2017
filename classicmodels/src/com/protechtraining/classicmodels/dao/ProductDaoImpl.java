package com.protechtraining.classicmodels.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.protechtraining.classicmodels.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.dao.ProductDao#findAll()
	 */
	@Override
	public List<Product> findAll(String couponCode) {
		return (List<Product>) jdbcTemplate.query("SELECT productCode as code,"
				+ "productName as name, productLine as line,"
				+ "productScale as scale, productVendor as vendor,"
				+ "productDescription as description, quantityInStock,"
				+ "buyprice, MSRP FROM products order by productCode",
				//new BeanPropertyRowMapper<Product>(Product.class));
				new ProductRowMapper(couponCode));
	}
}
