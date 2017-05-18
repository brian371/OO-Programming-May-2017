package com.protechtraining.classicmodels.patterns.decorator;

import java.util.Date;
import java.util.List;

import com.protechtraining.classicmodels.model.Order;
import com.protechtraining.classicmodels.model.OrderDetail;

public class ExtendedWarrantyDecorator extends OrderDecorator {
	
	public ExtendedWarrantyDecorator(Order parentOrder) {
		super(parentOrder);
	}

	@Override
	public double getOrderTotal() {
		// calculate the extended warranty total.  Probably some
		// formula...
		double extendedWarrantyTotal = 12.34;
		return this.parentOrder.getOrderTotal() + extendedWarrantyTotal;
	}

}
