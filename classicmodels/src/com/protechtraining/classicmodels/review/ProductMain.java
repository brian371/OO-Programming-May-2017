package com.protechtraining.classicmodels.review;

import com.protechtraining.classicmodels.model.Product;


public class ProductMain {

	public static void main(String[] args) {
		System.out.println("Before");
		foo();
		System.out.println("After");
	}
	
	public static void foo() {
	Product p = new Product();
		p.setCode("ABC");
		System.out.println(p.toString());
		
		Product p2  = new Product("7383", "1969 Harley", "Motoroycle");
		System.out.println(p2);
		System.gc();
//		p = null;  // the object formally known as p is now available for garbage collection
//		p2 = null;

	}

}
