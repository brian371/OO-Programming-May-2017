package com.protechtraining.classicmodels.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.protechtraining.classicmodels.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* (non-Javadoc)
	 * @see com.protechtraining.classicmodels.dao.OrderDao#findByCustomerNumber(int)
	 */
	@Override
	public List<Order> findByCustomerNumber(int customerNumber) {
		return (List<Order>) jdbcTemplate.query("select orderNumber, orderDate," +
					" requiredDate, shippedDate, status, comments, customerNumber " +
					" from orders where customerNumber = ?",
					new OrderRowMapper(), customerNumber);
	}
}
