package com.cg.DayFive;

public class Daughter extends Parent{
	public void speak() {
		System.out.println("Daugter is Speaking...");
	}
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.speak();
	}

}
