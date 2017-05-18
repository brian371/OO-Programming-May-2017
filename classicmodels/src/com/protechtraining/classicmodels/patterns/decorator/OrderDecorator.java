package com.protechtraining.classicmodels.patterns.decorator;

import java.util.Date;
import java.util.List;

import com.protechtraining.classicmodels.model.Order;
import com.protechtraining.classicmodels.model.OrderDetail;
/*
 * We are going to leave this empty for now.
 */
public abstract class OrderDecorator implements Order {
	protected Order parentOrder;
	
	public OrderDecorator(Order parentOrder) {
		this.parentOrder = parentOrder;
	}
	
	public Order getParentOrder() {
		return parentOrder;
	}

	@Override
	public int getOrderNumber() {
		// TODO Auto-generated method stub
		return this.parentOrder.getOrderNumber();
	}

	@Override
	public void setOrderNumber(int orderNumber) {
		this.parentOrder.setOrderNumber(orderNumber);
	}

	@Override
	public Date getOrderDate() {
		return this.parentOrder.getOrderDate();
	}

	@Override
	public void setOrderDate(Date orderDate) {
		this.parentOrder.setOrderDate(orderDate);
	}

	@Override
	public Date getRequiredDate() {
		return this.parentOrder.getRequiredDate();
	}

	@Override
	public void setRequiredDate(Date requiredDate) {
		this.parentOrder.setRequiredDate(requiredDate);
	}

	@Override
	public Date getShippedDate() {
		return this.parentOrder.getShippedDate();
	}

	@Override
	public void setShippedDate(Date shippedDate) {
		this.parentOrder.setShippedDate(shippedDate);
	}

	@Override
	public String getStatus() {
		return this.parentOrder.getStatus();
	}

	@Override
	public void setStatus(String status) {
		this.parentOrder.setStatus(status);
	}

	@Override
	public void placeOrder() {
		this.parentOrder.placeOrder();
	}

	@Override
	public String getComments() {
		return this.parentOrder.getComments();
	}

	@Override
	public void setComments(String comments) {
		this.parentOrder.setComments(comments);
	}

	@Override
	public int getCustomerNumber() {
		return this.parentOrder.getCustomerNumber();
	}

	@Override
	public void setCustomerNumber(int customerNumber) {
		this.parentOrder.setCustomerNumber(customerNumber);
	}

	@Override
	public List<OrderDetail> getOrderDetails() {
		return this.parentOrder.getOrderDetails();
	}

	@Override
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.parentOrder.setOrderDetails(orderDetails);
		
	}

}
