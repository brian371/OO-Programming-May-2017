package com.protechtraining.classicmodels.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.protechtraining.classicmodels.model.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.dao.ProductDao#findAll()
	 */
	@Override
	public List<Product> findAll() {
		return (List<Product>) jdbcTemplate.query("SELECT productCode as code,"
				+ "productName as name, productLine as line,"
				+ "productScale as scale, productVendor as vendor,"
				+ "productDescription as description, quantityInStock,"
				+ "buyprice MSRP FROM Products order by productCode",
				new BeanPropertyRowMapper<Product>(Product.class));
	}
}
