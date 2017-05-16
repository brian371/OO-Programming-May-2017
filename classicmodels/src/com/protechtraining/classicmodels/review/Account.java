package com.protechtraining.classicmodels.review;

public class Account {
	// attributes or fields
	private int accountNo;
	private double balance;

	public Account() {
		super();
	}
	
	
	public Account(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}


	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdrawl(double amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	
}
