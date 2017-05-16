package com.protechtraining.classicmodels.patterns.templatemethod;

import java.util.Date;
import java.util.List;

import com.protechtraining.classicmodels.model.Order;

public class OrderReport {
	// header information - could be broken into another class
	private String title;
	private Date reportDate;
	private int customerNumber;
	
	// body information
	private List<Order> orderList;
	
	// footer information
	private String footer;


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getReportDate() {
		return reportDate;
	}


	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public List<Order> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}


	public String getFooter() {
		return footer;
	}


	public void setFooter(String footer) {
		this.footer = footer;
	}
	
	
	
}
