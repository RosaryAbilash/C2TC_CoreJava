package com.cg.DaySix;

public class Static {
	
	static int num = 1;
	// Instance Variable
	int num2 = 1;
	
	public static void main(String[] args) {
		Static s = new Static();
		System.out.println("Num = "+num+" Num2 "+ s.num2);
		num++;
		Static s1 = new Static();
		System.out.println("Updated Num = "+num+" Updated Num2 "+ s1.num2);
		
	}

}
