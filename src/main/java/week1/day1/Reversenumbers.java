package week1.day1;

import java.util.Scanner;

public class Reversenumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		//Method 1
		
		
		  int rev = 0;
		  
		  while (num!= 0)
			  
		  { rev = rev*10 + num%10;
		  
		  num = num/10; }
		 
		 
		
		// method 2
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num));
		 * 
		 * StringBuffer rev = sb.reverse();
		 */
		 
		
		//meathod 3
		
		
		/*
		 * StringBuilder sb1 = new StringBuilder();
		 * 
		 * sb1.append(num);
		 * 
		 * StringBuilder rev = sb1.reverse();
		 */
		  
		  System.out.println(rev);
		 
		
		
		
		
	}

}
