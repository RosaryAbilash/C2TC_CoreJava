package com.cg.DayTen;

public class MultiDimArray {
	
	public static void MatMultiply(int arr1[][], int arr2[][]) {
		System.out.println("Matrix Multiplication...");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr1[i][j]*arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************");
	}
	
	public static void printMultiDimArray(int arr[][]) {
		System.out.println("Printing The Elements in the Multi Dimension Array...");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************");
	}
	

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3,4},
					   {5,6,7,8},
					   {9,10,11,12},
					   {13,14,15,16}};
		
		int arr2[][] = {{1,2,3,4},
				   {5,6,7,8},
				   {9,10,11,12},
				   {13,14,15,16}};
		
		printMultiDimArray(arr1);
		MatMultiply(arr1, arr2);
		
	
	}
}
