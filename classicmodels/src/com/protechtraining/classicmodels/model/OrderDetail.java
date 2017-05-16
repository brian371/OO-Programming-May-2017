package com.protechtraining.classicmodels.model;

public class OrderDetail {
	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private double priceEach;
	private int orderLineNumber;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public double getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	@Override
	public String toString() {
		return "OrderDetail [orderNumber=" + orderNumber + ", productCode="
				+ productCode + ", quantityOrdered=" + quantityOrdered
				+ ", priceEach=" + priceEach + ", orderLineNumber="
				+ orderLineNumber + "]";
	}

	
	
}
