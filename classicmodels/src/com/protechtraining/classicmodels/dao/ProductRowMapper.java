package com.protechtraining.classicmodels.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.protechtraining.classicmodels.model.Product;
import com.protechtraining.classicmodels.model.ProductLine;
import com.protechtraining.classicmodels.patterns.abstractfactory.AbstractPricingFactory;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactoryImpl;

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
		p.setLine(ProductLine.valueOf(rs.getString("line")));
		p.setScale(rs.getString("scale"));
		p.setVendor(rs.getString("vendor"));
		p.setDescription(rs.getString("description"));
		p.setQuantityInStock(rs.getInt("quantityInStock"));
		p.setBuyPrice(rs.getDouble("buyPrice"));
		p.setMSRP(rs.getDouble("MSRP"));
		
		PricingStrategyFactory factory =
				AbstractPricingFactory.getInteralPricingStrategyFactory();
		
		if ("15off".equals(coupon)) {
			//p.setPriceStrategy(new DiscountPricingStrategy(p, .15));
		} else if (ProductLine.Motorcycles.equals(p.getLine())) {
			p.setPricingStrategy(
					factory.getMotorcyclePricingStrategy());
		} else {
			p.setPricingStrategy(
					factory.getStandardPricingStrategy());
		} 
		
//		p.setPricingStrategy(
//				PricingStrategyFactory.getPricingStrategy(p.getLine()));
		return p;
	}

}
