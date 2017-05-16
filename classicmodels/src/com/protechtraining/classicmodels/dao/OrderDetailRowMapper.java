package com.protechtraining.classicmodels.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.protechtraining.classicmodels.model.OrderDetail;

public class OrderDetailRowMapper implements RowMapper<OrderDetail>{

	@Override
	public OrderDetail mapRow(ResultSet rs, int rowNumber) throws SQLException {
		OrderDetail od = new OrderDetail();
		od.setOrderNumber(rs.getInt("orderNumber"));
		od.setProductCode(rs.getString("productCode"));
		od.setQuantityOrdered(rs.getInt("quantityOrdered"));
		od.setPriceEach(rs.getDouble("priceEach"));
		od.setOrderLineNumber(rs.getInt("orderLineNumber"));
		return od;
	}
	
	
}
