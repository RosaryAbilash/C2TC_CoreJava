package com.cg.DayTen;

public class ArrayOperation {
	
	public static void printArray(int arr[]) {
		System.out.println("Printing Array Elements...");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**************************");
	}
	
	
	public static int EvenCount(int arr[]) {
		int eCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				eCount++;
			}
		}
		return eCount;
	}
	
	public static int OddCount(int arr[]) {
		return arr.length-EvenCount(arr);
	}
	
}
