package com.protechtraining.classicmodels.model;

import com.protechtraining.classicmodels.patterns.strategy.MotorcyclePricingStrategy;
import com.protechtraining.classicmodels.patterns.strategy.PricingStrategy;
import com.protechtraining.classicmodels.patterns.strategy.StandardPricingStrategy;

public class Product {
	public static final int REORDER_QUANITY = 100;

	private String code;
	private String name;
	private ProductLine line;
	private String scale;
	private String vendor;
	private String description;
	private int quantityInStock;
	private double buyPrice;
	private double MSRP;

	private PricingStrategy pricingStrategy;
	
	// constructor
	public Product() {
		this(null, null, ProductLine.Motorcycles);
		System.out.println("In the constructor...");
		//line = "Motorcycles";
	}

	public Product(String code, String name, ProductLine line) {
		System.out.println("In the second constructor");
		this.code = code;
		this.name = name;
		this.line = line;
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductLine getLine() {
		return line;
	}

	public void setLine(ProductLine line) {
		this.line = line;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMSRP() {
		return MSRP;
	}

	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}

	// Business methods
	public double getSalePrice() {		
		return pricingStrategy.calculateSalesPrice(this);
	}
	
	
	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", line=" + line
				+ ", scale=" + scale + ", vendor=" + vendor + ", description="
				+ description + ", quantityInStock=" + quantityInStock
				+ ", buyPrice=" + buyPrice + ", MSRP=" + MSRP + "]";
	}
}