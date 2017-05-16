package com.protechtraining.classicmodels.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.protechtraining.classicmodels.model.OrderDetail;

@Repository
public class OrderDetailDaoImpl implements OrderDetailDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.dao.OrderDetailDao#findByOrderNumber(int)
	 */
	@Override
	public List<OrderDetail> findByOrderNumber(int orderNumber) {
		return (List<OrderDetail>) jdbcTemplate.query("select orderNumber, productCode," +
					" quantityOrdered, priceEach, orderLineNumber " +
					" from orderdetails where orderNumber = ?",
					new OrderDetailRowMapper(), orderNumber);
	}
}
