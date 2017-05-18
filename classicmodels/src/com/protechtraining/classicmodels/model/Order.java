package com.protechtraining.classicmodels.model;

import java.util.Date;
import java.util.List;

public interface Order {

	public abstract int getOrderNumber();

	public abstract void setOrderNumber(int orderNumber);

	public abstract Date getOrderDate();

	public abstract void setOrderDate(Date orderDate);

	public abstract Date getRequiredDate();

	public abstract void setRequiredDate(Date requiredDate);

	public abstract Date getShippedDate();

	public abstract void setShippedDate(Date shippedDate);

	public abstract String getStatus();

	public abstract void setStatus(String status);

	public abstract void placeOrder();

	public abstract String getComments();

	public abstract void setComments(String comments);

	public abstract int getCustomerNumber();

	public abstract void setCustomerNumber(int customerNumber);

	public abstract List<OrderDetail> getOrderDetails();

	public abstract void setOrderDetails(List<OrderDetail> orderDetails);

	public abstract String toString();

	public abstract double getOrderTotal();

}