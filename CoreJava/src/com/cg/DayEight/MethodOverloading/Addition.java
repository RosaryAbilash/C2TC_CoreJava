package com.cg.DayEight.MethodOverloading;

public class Addition {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(5, 6);
		a.add(3, 40, 60);
		a.add(45, 450, 750, 608);
	}

}
