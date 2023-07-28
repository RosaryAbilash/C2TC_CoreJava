package com.cg.DayTwo;

import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int age;
		if(n%2==0) {
			System.out.println("You Entered Even Number. Enter Your Age: ");
			age = sc.nextInt();
			if(age > 18) {
				System.out.println("Eligible for Voting");
			}
			else {
				System.out.println("You have to wait to eligible for voting");
			}
		}
		else {
			System.out.println("Odd Number....");
		}
	}

}
