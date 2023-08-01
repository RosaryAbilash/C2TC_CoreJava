package com.cg.DayNine.BankAccount;

public interface Bank {
	public final float MIN_BALANCE = 0;
	public final float DEPOSIT_LIMIT = 25000;
	
	public abstract float deposit(float amount);
	public abstract float withdraw(float amount);
}
