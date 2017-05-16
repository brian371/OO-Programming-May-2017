package com.protechtraining.classicmodels.dao;

import java.util.List;

import com.protechtraining.classicmodels.model.OrderDetail;

public interface OrderDetailDao {

	public abstract List<OrderDetail> findByOrderNumber(int orderNumber);

}