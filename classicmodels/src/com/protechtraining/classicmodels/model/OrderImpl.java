package com.protechtraining.classicmodels.model;

import java.util.Date;
import java.util.List;
import java.util.Observable;

import com.protechtraining.classicmodels.patterns.observer.WarehouseObserver;

public class OrderImpl extends Observable implements Order {
	private int orderNumber;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private String status;
	private String comments;
	private int customerNumber;
	private List<OrderDetail> orderDetails;
	
	public OrderImpl() {
		super();
		this.addObserver(new WarehouseObserver());
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getOrderNumber()
	 */
	@Override
	public int getOrderNumber() {
		return orderNumber;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setOrderNumber(int)
	 */
	@Override
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getOrderDate()
	 */
	@Override
	public Date getOrderDate() {
		return orderDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setOrderDate(java.util.Date)
	 */
	@Override
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getRequiredDate()
	 */
	@Override
	public Date getRequiredDate() {
		return requiredDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setRequiredDate(java.util.Date)
	 */
	@Override
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getShippedDate()
	 */
	@Override
	public Date getShippedDate() {
		return shippedDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setShippedDate(java.util.Date)
	 */
	@Override
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getStatus()
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setStatus(java.lang.String)
	 */
	@Override
	public void setStatus(String status) {
		this.status = status;	
	}
	
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#placeOrder()
	 */
	@Override
	public void placeOrder() {
		this.orderDate = new Date();
		this.setChanged();  // marks the Order as changed (does not notify yet)
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getComments()
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setComments(java.lang.String)
	 */
	@Override
	public void setComments(String comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getCustomerNumber()
	 */
	@Override
	public int getCustomerNumber() {
		return customerNumber;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setCustomerNumber(int)
	 */
	@Override
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#getOrderDetails()
	 */
	@Override
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#setOrderDetails(java.util.List)
	 */
	@Override
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Override
	public double getOrderTotal() {
		// TODO:  calculate this from the OrderItems....
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.model.Order#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", orderDate=" + orderDate
				+ ", requiredDate=" + requiredDate + ", shippedDate="
				+ shippedDate + ", status=" + status + ", comments=" + comments
				+ ", customerNumber=" + customerNumber + "]";
	}
	
	
}
