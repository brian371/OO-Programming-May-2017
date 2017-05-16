package com.protechtraining.classicmodels.patterns.strategy;

public interface PricingStrategy {
	public abstract double calculateSalesPrice();
	
	// you could have other methods - tradeInPrice, for example
}
