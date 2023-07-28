package com.cg.DayTwo;

public class Operators {
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	int sub(int n1, int n2) {
		return n1-n2;
	}
	int mul(int n1, int n2) {
		return n1*n2;
	}
	int div(int n1, int n2) {
		return n1/n2;
	}
	public static void main(String[] args) {
		Operators op = new Operators();
		System.out.println("Addition is "+op.add(23, 290));
		System.out.println("Subtraction is "+op.sub(623, 290));
		System.out.println("Division is "+op.div(235, 5));
		System.out.println("Multiplication is "+op.mul(233, 290));
	}

}
