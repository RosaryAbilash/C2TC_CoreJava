package com.cg.DayTwo;

public class BreakContinue {

	public static void main(String[] args) {
		int n = 10;
		
		//Continue
		System.out.println("Continue....");
		for(int i = 0; i <= n; i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		System.out.println("Break....");
		for(int i = 0; i <= n; i++) {
			if(i==6)
				break;
			System.out.println(i);
		}
		
	}

}
