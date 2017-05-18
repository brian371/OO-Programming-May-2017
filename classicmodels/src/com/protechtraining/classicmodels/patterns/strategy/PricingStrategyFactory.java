package com.protechtraining.classicmodels.patterns.strategy;

public interface PricingStrategyFactory {

	// -- start style 1
	// implementing a singleton design pattern
	public abstract PricingStrategy getMotorcyclePricingStrategy();

	public abstract PricingStrategy getStandardPricingStrategy();
	// -- end style 1

}