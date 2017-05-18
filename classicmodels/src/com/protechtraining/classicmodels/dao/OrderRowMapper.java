package com.protechtraining.classicmodels.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.protechtraining.classicmodels.model.OrderImpl;

public class OrderRowMapper implements RowMapper<OrderImpl> {

	@Override
	public OrderImpl mapRow(ResultSet rs, int rowNumber) throws SQLException {
		OrderImpl o = new OrderImpl();
		o.setOrderNumber(rs.getInt("orderNumber"));
		o.setOrderDate(rs.getDate("orderDate"));
		o.setRequiredDate(rs.getDate("requiredDate"));
		o.setShippedDate(rs.getDate("shippedDate"));
		o.setStatus(rs.getString("status"));
		o.setComments(rs.getString("comments"));
		o.setCustomerNumber(rs.getInt("customerNumber"));
		return o;
	} 
}
