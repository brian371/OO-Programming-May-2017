package com.protechtraining.classicmodels.review;

public class AccountMain {

	public static void main(String[] args) {
		Account acct1 = new Account();
		acct1.setAccountNo(1000);
		acct1.setBalance(3000.0);
		acct1.withdrawl(500.0);
		System.out.println(acct1.toString());

		Account acct2 = acct1;
		acct2.setAccountNo(1001);
		acct2.setBalance(200.0);
		
		System.out.println(acct2.toString());
		System.out.println(acct1.toString());
		
		Account savings1 = new SavingsAccount(123, 1003.44, 3.55);
		
		
		System.out.println(savings1.toString());
		
		// casting from the base class reference to the derived;
		if (savings1 instanceof SavingsAccount) {
			SavingsAccount temp = (SavingsAccount) savings1;
			System.out.println("accurred intereste is " + temp.getAccurredInterest());
		}		
	}
}
