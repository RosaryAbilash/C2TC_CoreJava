package com.cg.DayNine.BankAccount;

public class Person implements Bank {
	public String name;
	public String city;
	public float balance;
	public int Account_Number;
	
	
	public Person(String name, String city, float balance, int account_Number) {
		super();
		this.name = name;
		this.city = city;
		this.balance = balance;
		Account_Number = account_Number;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", balance=" + balance + ", Account_Number=" + Account_Number
				+ "]";
	}
	
	@Override
	public float deposit(float amount) {
		if (amount > 25000) {
			System.out.println("Deposit Limit Is Exceeded...");
		}
		else {
			balance += amount;
			System.out.println("Amount is Deposited in the Bank Account,\n The Balance is  "+balance);
		}
		return balance;
	}
	
	@Override
	public float withdraw(float amount) {
		if(amount > balance) {
			System.out.println("Enough Balance is Not Available...");
		}
		else {
			balance -= amount;
			System.out.println("The Amount is Withdrawn Successfully. \n The Balance is "+ balance);
		}
		return balance;
	}
}
