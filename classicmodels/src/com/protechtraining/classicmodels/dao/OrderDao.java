package com.protechtraining.classicmodels.dao;

import java.util.List;

import com.protechtraining.classicmodels.model.Order;

public interface OrderDao {

	public abstract List<Order> findByCustomerNumber(int customerNumber);

}