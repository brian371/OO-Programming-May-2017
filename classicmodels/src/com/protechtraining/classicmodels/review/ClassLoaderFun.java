package com.protechtraining.classicmodels.review;

import java.lang.reflect.Method;

import com.protechtraining.classicmodels.model.Order;
import com.protechtraining.classicmodels.model.OrderImpl;

public class ClassLoaderFun {

	public static void main(String[] args) {
		Order o = new OrderImpl();
		// The Order.class represents the loaded Class object
		//Order.class
		
		// You can also get to the Class object by doing .getClass on an object
		o.getClass();
		System.out.println(OrderImpl.class == o.getClass());
		
		// Sometimes classes are loaded dynamically
		try {
			Class productClass = Class.forName("com.protechtraining.classicmodels.model.Product");
			// You can use the Java Reflection API
			Object myProductObject = productClass.newInstance();
			//Method m1 = productClass.getMethod(name, parameterTypes)
			System.out.println(myProductObject);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
