package coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows num");
		int rows = sc.nextInt();
		
		System.out.println("Enter the colums num");
		int cols = sc.nextInt();
		
		
		//create 2d array to fill the data into the matrix
		int data[][] = new int [rows][cols];
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				
				data[i][j]=sc.nextInt();
			}
		}
		
		//To print the matrix create another for loop
		
		/*
		 * for (int i = 0; i < rows; i++) {
		 * 
		 * for (int j = 0; j < cols; j++) {
		 * 
		 * System.out.print(data[i][j]+" ");
		 * 
		 * } System.out.println(); }
		 */
		
		//method 2 using for each
		
		
		  for (int[] ro : data) {
		  
		  for (int x : ro) {
		  
		  System.out.print(x+" ");
		  
		  } System.out.println(); }
		 
		
		//using inbuilt method
		/*
		 * for (int[] r : data) {
		 * 
		 * System.out.println(Arrays.toString(r));
		 * 
		 * }
		 */
		
	}

}
