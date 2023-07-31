package com.cg.DayEight;

public class RBI extends Bank{
	
	public float getInterest() {
		return 12.0f;
	}
	public static void main(String args[]) {
		Bank r = new RBI();
		System.out.println(r.getInterest());
	}

}
