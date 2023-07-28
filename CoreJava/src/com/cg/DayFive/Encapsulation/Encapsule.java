package com.cg.DayFive.Encapsulation;

public class Encapsule {
	private String name;
	private int age;
	private int salary;
	private long mobile;
	public Encapsule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsule(String name, int age, int salary, long mobile) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student Data [Student name=" + name + ",Student age=" + age + ",Student salary=" + salary + ",Student mobile=" + mobile + "]";
	}

}
