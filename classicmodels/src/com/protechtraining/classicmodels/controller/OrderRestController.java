package com.protechtraining.classicmodels.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protechtraining.classicmodels.model.Order;
import com.protechtraining.classicmodels.model.OrderImpl;
import com.protechtraining.classicmodels.patterns.decorator.ExtendedWarrantyDecorator;

@RestController
@RequestMapping(value = "/orders")
public class OrderRestController {

	@RequestMapping(method = RequestMethod.POST, 
			consumes={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> create(@RequestBody OrderImpl order,
			@RequestParam(value="extendedWarranty", required=false) 
			String extendedWarranty) {
		Order decoratedOrder = order;
		if ("yes".equals(extendedWarranty)) {
			decoratedOrder=new ExtendedWarrantyDecorator(decoratedOrder);
		}
		String responseMessage = "Order total: " + 
				decoratedOrder.getOrderTotal();
		System.out.println(responseMessage);
		return new ResponseEntity<String>(
				responseMessage,HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, 
			consumes={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> update(@RequestBody OrderImpl order) {
		// real code to update the database
		
		// if the database update is successfull
		if ("shipped".equals(order.getStatus())) {
			order.placeOrder();
		}
		order.notifyObservers(); // call the update method on all observers
		
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
}
