package com.protechtraining.classicmodels.patterns.abstractfactory;

import com.protechtraining.classicmodels.model.Product;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategy;

public class EbayMotorcyclePricingStrategy implements PricingStrategy{

	@Override
	public double calculateSalesPrice(Product p) {
		// TODO Auto-generated method stub
		return p.getMSRP();
	}

}
