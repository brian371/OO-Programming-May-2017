package com.protechtraining.classicmodels.review;

public class SavingsAccount extends Account {
	private double accurredInterest;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNo, double balance, double accurredInterest) {
		super(accountNo, balance);
		this.accurredInterest = accurredInterest;
	}

	public double getAccurredInterest() {
		return accurredInterest;
	}

	public void setAccurredInterest(double accurredInterest) {
		this.accurredInterest = accurredInterest;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accurredInterest=" + accurredInterest
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
