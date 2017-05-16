package com.protechtraining.classicmodels.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.protechtraining.classicmodels.model.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderRestController {

	@RequestMapping(method = RequestMethod.PUT, 
			consumes={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> update(@RequestBody Order order) {
		// real code to update the database
		
		// if the database update is successfull
		if ("shipped".equals(order.getStatus())) {
			order.placeOrder();
		}
		order.notifyObservers(); // call the update method on all observers

		
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
}
