package com.protechtraining.classicmodels.review;

public class SavingsAccount extends Account {
	private double accurredInterest;
	private static double interestRate = 0.01;
	public static final double MAINTENANCE_FEE = 5.00;

	// static initialization block (static constructor)
	static {
		System.out.println("Inside static block");
		// write whatever initialization code to load the interest rate
		double foo = 0.2;
		double bar = 0.1;
		SavingsAccount.interestRate = foo + bar;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

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
	
	public double calculateInterest() {
		double interest = getBalance() * SavingsAccount.interestRate;
		this.accurredInterest += interest;
		return interest;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accurredInterest=" + accurredInterest
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
