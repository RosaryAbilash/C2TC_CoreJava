package com.cg.DayEight;

public class HDFC extends Bank{
	public float getInterest() {
		return 25.0f;
	}
	
	public static void main(String[] args) {
		Bank h = new HDFC();
		System.out.println(h.getInterest());
	}

}
