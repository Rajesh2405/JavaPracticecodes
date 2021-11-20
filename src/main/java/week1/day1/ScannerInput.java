package week1.day1;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {

		System.out.println("Enter exp :");
		
		Scanner x = new Scanner(System.in);
		
		String y = x.nextLine();	
		
		int toyexp = Integer.parseInt(y);
		
		System.out.println("Total YOE :"+(toyexp+2)+" years");
		
	}

}
