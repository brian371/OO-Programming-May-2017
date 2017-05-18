package com.protechtraining.classicmodels.patterns.abstractfactory;

import com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactoryImpl;

public class AbstractPricingFactory {

	public static PricingStrategyFactory getInteralPricingStrategyFactory() 
	{
		return PricingStrategyFactoryImpl.getInstance();
	}
	
	public static PricingStrategyFactory getEbayPricingStrategyFactory() 
	{
		return EbayPricingStrategyFactoryImpl.getInstance();
	}
}
