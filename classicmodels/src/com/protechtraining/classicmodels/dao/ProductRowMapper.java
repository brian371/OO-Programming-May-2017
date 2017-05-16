package com.protechtraining.classicmodels.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.protechtraining.classicmodels.model.Product;
import com.protechtraining.classicmodels.model.ProductImpl;
import com.protechtraining.classicmodels.patterns.strategy.DiscountStrategy;

public class ProductRowMapper implements RowMapper<Product> {
	private String coupon;
	
	public ProductRowMapper(String coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public Product mapRow(ResultSet rs, int rowNumber) throws SQLException {
		ProductImpl p = new ProductImpl();
		p.setCode(rs.getString("productCode"));
		p.setName(rs.getString("productName"));
		p.setLine(rs.getString("productLine"));
		p.setScale(rs.getString("productScale"));
		p.setVendor(rs.getString("productVendor"));
		p.setDescription(rs.getString("productDescription"));
		p.setQuantityInStock(rs.getInt("quantityInStock"));
		p.setBuyPrice(rs.getDouble("buyPrice"));
		p.setMSRP(rs.getDouble("MSRP"));
		
		if ("Motorcycle".equals(coupon)) {
			p.setPriceStrategy(new DiscountStrategy(p, .15));
		}
		return p;
	}

}
