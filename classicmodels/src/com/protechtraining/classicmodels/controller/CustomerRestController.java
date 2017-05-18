package com.protechtraining.classicmodels.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protechtraining.classicmodels.model.OrderImpl;
import com.protechtraining.classicmodels.patterns.templatemethod.OrderDetailReport;
import com.protechtraining.classicmodels.patterns.templatemethod.OrderReport;
import com.protechtraining.classicmodels.patterns.templatemethod.OrderReportTemplate;
import com.protechtraining.classicmodels.patterns.templatemethod.OrderSummaryReport;

@RestController
@RequestMapping(value = "/customers")
public class CustomerRestController {
	@Autowired
	private OrderSummaryReport orderSummaryReport;
	@Autowired
	private OrderDetailReport orderDetailReport;
	

	@RequestMapping(value="/{customerNo}/orders",
			method = RequestMethod.GET, 
			produces={MediaType.APPLICATION_JSON_VALUE})
	public OrderReport getOrderReport(@PathVariable("customerNo") int customerNumber, 
			@RequestParam(value="orderType", required=true) String orderType) {
		// fetch data from database
		OrderReportTemplate template;
		List<OrderImpl> orders = new ArrayList<OrderImpl>();
		
		if ("summary".equals(orderType)) {
			template = orderSummaryReport;
		} else {
			template = orderDetailReport;
		}
		template.setCustomerNumber(customerNumber);
		return template.generateReport();
	}
	
}
