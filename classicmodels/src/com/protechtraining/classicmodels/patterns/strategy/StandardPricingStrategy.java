package com.protechtraining.classicmodels.patterns.strategy;

import com.protechtraining.classicmodels.model.Product;

public class StandardPricingStrategy implements PricingStrategy {

	public StandardPricingStrategy() {
		super();
	}
	
	@Override
	public double calculateSalesPrice(Product product) {
		return product.getMSRP();
	}

}
