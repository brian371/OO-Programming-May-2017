package com.protechtraining.classicmodels.patterns.decorator;

import com.protechtraining.classicmodels.model.Order;

public class PaintProtectionDecorator extends OrderDecorator{
	public PaintProtectionDecorator(Order parentOrder) {
		super(parentOrder);
	}

	@Override
	public double getOrderTotal() {
		// calculate the extended warranty total.  Probably some
		// formula...
		double paintProtectionFee = 19.99;
		return this.parentOrder.getOrderTotal() + paintProtectionFee;
	}

}
