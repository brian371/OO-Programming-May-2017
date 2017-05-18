package com.protechtraining.classicmodels.dao;

import java.util.List;

import com.protechtraining.classicmodels.model.OrderImpl;

public interface OrderDao {

	public abstract List<OrderImpl> findByCustomerNumber(int customerNumber);

}