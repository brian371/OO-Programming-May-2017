package com.protechtraining.classicmodels.patterns.templatemethod;

import java.util.Date;

public abstract class OrderReportTemplate {
	// this holds all the report data (header, body, and footer)
	protected OrderReport orderReport; 
	protected int customerNumber;
	
	public OrderReportTemplate() {
		orderReport = new OrderReport();
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	// this is the main driving method
	public OrderReport generateReport() {
		loadHeader();
		loadBody();
		loadFooter();
		return orderReport;
	}

	// helper (template method)
	public void loadHeader() {
		orderReport.setTitle("Order report for customer .");
		orderReport.setReportDate(new Date());
		orderReport.setCustomerNumber(customerNumber);
	}
	
	// helper (template method, filled in by subclass)
	public abstract void loadBody();

	// helper (template method)
	public void loadFooter() {
		orderReport.setFooter("Copyright 2017 State of Missouri");
	}

	public OrderReport getOrderReport() {
		return orderReport;
	}

}
