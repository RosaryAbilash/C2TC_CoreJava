package com.cg.DayNine.Abstraction;

public class Square extends Abstract{
	
	public void display() {
		System.out.println("Square Class....");
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		s.display();
	}

}
