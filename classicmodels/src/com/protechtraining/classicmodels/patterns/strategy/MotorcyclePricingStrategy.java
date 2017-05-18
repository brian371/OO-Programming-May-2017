package com.protechtraining.classicmodels.patterns.strategy;

import com.protechtraining.classicmodels.model.Product;

public class MotorcyclePricingStrategy implements PricingStrategy {
	private static final double MOTORCYCLE_DISCOUNT = 0.10;
	
	public MotorcyclePricingStrategy() {
		super();
	}

	@Override
	public double calculateSalesPrice(Product product) {
		// TODO Auto-generated method stub
		return product.getMSRP() * (1 - MOTORCYCLE_DISCOUNT);
	}

}
