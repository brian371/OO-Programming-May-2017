package com.protechtraining.classicmodels.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.protechtraining.classicmodels.model.Product;
import com.protechtraining.classicmodels.patterns.strategy.MotorcyclePricingStrategy;
import com.protechtraining.classicmodels.patterns.strategy.StandardPricingStrategy;

public class ProductRowMapper implements RowMapper<Product> {
	private String coupon;
	
	public ProductRowMapper(String coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public Product mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Product p = new Product();
		p.setCode(rs.getString("code"));
		p.setName(rs.getString("name"));
		p.setLine(rs.getString("line"));
		p.setScale(rs.getString("scale"));
		p.setVendor(rs.getString("vendor"));
		p.setDescription(rs.getString("description"));
		p.setQuantityInStock(rs.getInt("quantityInStock"));
		p.setBuyPrice(rs.getDouble("buyPrice"));
		p.setMSRP(rs.getDouble("MSRP"));
		
		if ("15off".equals(coupon)) {
			//p.setPriceStrategy(new DiscountPricingStrategy(p, .15));
		} else if ("Motorcycles".equals(p.getLine())) {
			p.setPricingStrategy(new MotorcyclePricingStrategy(p));
		} else {
			p.setPricingStrategy(new StandardPricingStrategy(p));
		} 
		return p;
	}

}
