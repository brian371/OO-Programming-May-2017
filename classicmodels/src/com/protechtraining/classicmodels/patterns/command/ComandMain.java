package com.protechtraining.classicmodels.patterns.command;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class ComandMain {

	public static void main(String[] args) {
		List<OrderCommand>  commands = new ArrayList<OrderCommand>();
		commands.add(new RecurringOrderCommand(103));
		commands.add(new RecurringOrderCommand(105));

		for (OrderCommand orderCommand : commands) {
			orderCommand.execute();
		}
		
	}

}
