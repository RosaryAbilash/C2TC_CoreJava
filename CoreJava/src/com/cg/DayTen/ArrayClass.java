package com.cg.DayTen;

//import java.util.Scanner;
public class ArrayClass {

	public static void main(String[] args) {
//		int array[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Numbers: ");
//		for(int i = 0; i < 10; i++) {
//			array[i] = sc.nextInt();
//		}
//		sc.close();
		int array[] = {1,2,3,4,54,6,7,8,9,10};
		
		ArrayOperation.printArray(array);
		
		System.out.println("Even Count is "+ ArrayOperation.EvenCount(array));
		System.out.println("Odd Count is "+ ArrayOperation.OddCount(array));
		
	}

}
