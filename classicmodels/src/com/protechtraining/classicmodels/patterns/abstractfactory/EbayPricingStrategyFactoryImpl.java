package com.protechtraining.classicmodels.patterns.abstractfactory;

import com.protechtraining.classicmodels.patterns.strategy.PricingStrategy;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory;

public class EbayPricingStrategyFactoryImpl implements PricingStrategyFactory{

	// these make this factory an singleton, where you have 1 copy
		private static EbayMotorcyclePricingStrategy motorcyle = null;
		private static EbayStandardPricingStrategy standard = null;
		private static PricingStrategyFactory instance = null;
		
		public static PricingStrategyFactory getInstance() {
			if (EbayPricingStrategyFactoryImpl.instance == null) {
				EbayPricingStrategyFactoryImpl.instance =
						new EbayPricingStrategyFactoryImpl();
			}
			return EbayPricingStrategyFactoryImpl.instance;
		}
		
		
		// stops unnecessary instantiation
		private EbayPricingStrategyFactoryImpl() {}
		
		
		
		// -- start style 1
		// implementing a singleton design pattern
		/* (non-Javadoc)
		 * @see com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory#getMotorcyclePricingStrategy()
		 */
		@Override
		public  PricingStrategy getMotorcyclePricingStrategy() {
			if (EbayPricingStrategyFactoryImpl.motorcyle == null) {
				EbayPricingStrategyFactoryImpl.motorcyle = 
						new EbayMotorcyclePricingStrategy();
			}
			return EbayPricingStrategyFactoryImpl.motorcyle;
		}
		/* (non-Javadoc)
		 * @see com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory#getStandardPricingStrategy()
		 */
		@Override
		public  PricingStrategy getStandardPricingStrategy() {
			if (EbayPricingStrategyFactoryImpl.standard == null) {
				EbayPricingStrategyFactoryImpl.standard = 
						new EbayStandardPricingStrategy();
			}
			return EbayPricingStrategyFactoryImpl.standard;
		}

}
