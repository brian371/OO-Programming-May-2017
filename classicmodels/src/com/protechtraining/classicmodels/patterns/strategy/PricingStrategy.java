package com.protechtraining.classicmodels.patterns.strategy;

import com.protechtraining.classicmodels.model.Product;

public interface PricingStrategy {
	public abstract double calculateSalesPrice(Product p);
	
	// you could have other methods - tradeInPrice, for example
}
