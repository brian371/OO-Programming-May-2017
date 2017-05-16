package com.protechtraining.classicmodels.model;

import java.util.Date;
import java.util.List;
import java.util.Observable;

import com.protechtraining.classicmodels.patterns.observer.WarehouseObserver;

public class Order extends Observable {
	private int orderNumber;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String status;
	private String comments;
	private int customerNumber;
	private List<OrderDetail> orderDetails;
	
	public Order() {
		super();
		this.addObserver(new WarehouseObserver());
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;	
	}
	
	public void placeOrder() {
		this.orderDate = new Date();
		this.setChanged();  // marks the Order as changed (does not notify yet)
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", orderDate=" + orderDate
				+ ", requiredDate=" + requiredDate + ", shippedDate="
				+ shippedDate + ", status=" + status + ", comments=" + comments
				+ ", customerNumber=" + customerNumber + "]";
	}
	
	
}
