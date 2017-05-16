package com.protechtraining.classicmodels.patterns.strategy;

import com.protechtraining.classicmodels.model.Product;

public class StandardPricingStrategy implements PricingStrategy {
	private Product product;

	public StandardPricingStrategy(Product product) {
		super();
		this.product = product;
	}
	
	@Override
	public double calculateSalesPrice() {
		return this.product.getMSRP();
	}

}
