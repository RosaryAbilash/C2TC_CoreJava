package com.cg.DayTwo;

import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("You have to wait to eligible for voting");
		}
	}

}
