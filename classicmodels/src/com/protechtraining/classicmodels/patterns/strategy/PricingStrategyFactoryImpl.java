package com.protechtraining.classicmodels.patterns.strategy;


public class PricingStrategyFactoryImpl implements PricingStrategyFactory {
	// these make this factory an singleton, where you have 1 copy
	private static MotorcyclePricingStrategy motorcyle = null;
	private static StandardPricingStrategy standard = null;
	private static PricingStrategyFactory instance = null;
	
	public static PricingStrategyFactory getInstance() {
		if (PricingStrategyFactoryImpl.instance == null) {
			PricingStrategyFactoryImpl.instance =
					new PricingStrategyFactoryImpl();
		}
		return PricingStrategyFactoryImpl.instance;
	}
	
	
	// stops unnecessary instantiation
	private PricingStrategyFactoryImpl() {}
	
	
	
	// -- start style 1
	// implementing a singleton design pattern
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory#getMotorcyclePricingStrategy()
	 */
	@Override
	public  PricingStrategy getMotorcyclePricingStrategy() {
		if (PricingStrategyFactoryImpl.motorcyle == null) {
			PricingStrategyFactoryImpl.motorcyle = 
					new MotorcyclePricingStrategy();
		}
		return PricingStrategyFactoryImpl.motorcyle;
	}
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.patterns.strategy.PricingStrategyFactory#getStandardPricingStrategy()
	 */
	@Override
	public  PricingStrategy getStandardPricingStrategy() {
		if (PricingStrategyFactoryImpl.standard == null) {
			PricingStrategyFactoryImpl.standard = 
					new StandardPricingStrategy();
		}
		return PricingStrategyFactoryImpl.standard;
	}
	// -- end style 1
	
	// -- start style2
/*public static PricingStrategy getPricingStrategy(ProductLine line) {
		if (ProductLine.Motorcycles.equals(line)) {
			return new MotorcyclePricingStrategy();
		} else {
			return new StandardPricingStrategy();
		} 
	}*/
	// -- end style2

	
	
}
