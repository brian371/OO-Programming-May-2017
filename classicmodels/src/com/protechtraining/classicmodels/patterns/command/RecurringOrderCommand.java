package com.protechtraining.classicmodels.patterns.command;

public class RecurringOrderCommand extends OrderCommandBase {
	private int parentOrderNumber;
	
	public RecurringOrderCommand(int parentOrderNumber) {
		super();
		this.parentOrderNumber = parentOrderNumber;
	}

	@Override
	public void execute() {
		log();
		// code to  place a recurring order.
		System.out.println("processing order for " + parentOrderNumber);

	}

}
