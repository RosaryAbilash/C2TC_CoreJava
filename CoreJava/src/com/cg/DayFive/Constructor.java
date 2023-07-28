package com.cg.DayFive;

public class Constructor {
	String name;
	int age;
	int salary;
	Constructor(String name, int age){
		this.name = name;
		this.age = age;
	}
	Constructor(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Constructor c = new Constructor("Rosary", 21);
		System.out.println("Name: "+c.name+" Age: "+c.age);
		Constructor c1 = new Constructor("Abilash", 21, 57000);
		System.out.println("Name: "+c1.name+" Age: "+c1.age+" Salary: "+c1.salary);
	}

}
