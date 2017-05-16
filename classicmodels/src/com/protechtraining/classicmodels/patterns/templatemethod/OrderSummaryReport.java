package com.protechtraining.classicmodels.patterns.templatemethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.protechtraining.classicmodels.dao.OrderDao;
import com.protechtraining.classicmodels.model.Order;

@Component
public class OrderSummaryReport extends OrderReportTemplate {
	@Autowired
	private OrderDao orderDao;
	
	public OrderSummaryReport() {
	}
	
	@Override
	public void loadBody() {
		List<Order> orders = orderDao.findByCustomerNumber(customerNumber);
		this.orderReport.setOrderList(orders);
		this.orderReport.setTitle("Summary Report");
	}

}
