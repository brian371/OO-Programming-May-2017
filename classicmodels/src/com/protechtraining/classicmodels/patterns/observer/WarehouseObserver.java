package com.protechtraining.classicmodels.patterns.observer;

import java.util.Observable;
import java.util.Observer;

import com.protechtraining.classicmodels.model.Order;

public class WarehouseObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Order order = (Order) o;
		System.out.println("Warehouse received order number " + order.getOrderNumber());

	}

}
