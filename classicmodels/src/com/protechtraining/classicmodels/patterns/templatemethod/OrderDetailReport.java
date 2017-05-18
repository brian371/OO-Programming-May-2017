package com.protechtraining.classicmodels.patterns.templatemethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.protechtraining.classicmodels.dao.OrderDao;
import com.protechtraining.classicmodels.dao.OrderDetailDao;
import com.protechtraining.classicmodels.model.Order;
import com.protechtraining.classicmodels.model.OrderImpl;

@Component
public class OrderDetailReport extends OrderReportTemplate {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	public OrderDetailReport() {
	}
	
	@Override
	public void loadBody() {
		List<OrderImpl> orders = orderDao.findByCustomerNumber(customerNumber);
		for (Order order : orders) {
			order.setOrderDetails(orderDetailDao.findByOrderNumber(order.getOrderNumber()));
		}
		
		this.orderReport.setOrderList(orders);
		this.orderReport.setTitle("Detail Report");
	}

}
