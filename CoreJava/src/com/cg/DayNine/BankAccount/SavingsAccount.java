package com.cg.DayNine.BankAccount;

public class SavingsAccount extends Person implements Bank{

	public SavingsAccount(String name, String city, float balance, int account_Number) {
		super(name, city, balance, account_Number);
	}

	public static void main(String[] args) {
		SavingsAccount SA1 = new SavingsAccount("Rosary", "Villupuram", 570000, 67539);
		System.out.println(SA1);
		
		SA1.deposit(26000);
		SA1.withdraw(30000);
		
		SA1.deposit(24999);
		SA1.withdraw(300);
	}

}
