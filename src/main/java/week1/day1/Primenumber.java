package week1.day1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the num");
		
		String inpnumb = sc.nextLine();
		
		int num = Integer.parseInt(inpnumb);
		
		int count = 0;
		for (int i = 1; i <=num; i++){
		
			if (num % i ==0) {
				
				count++;
			}
		}
		if (count ==2) {
			
			System.out.println(num+" is a prime number");
			
		}else {
			System.out.println(num+" is not a prime number");
		}
		
			
	// To check the num divisible by 3 or not
	
	Scanner nsc = new Scanner(System.in);
	System.out.println("Enter num to check divisibility");
	String dvnum = nsc.nextLine();
	
	int value = 0;
	
	
	for (int i = 0; i <dvnum.length(); i++) {
		
		 value = value +dvnum.charAt(i)-'0';
	}
	
	if (value % 3==0 && value % 5 ==0) {
		
		System.out.println(value+" is divisible by 3");
	}else {
		System.out.println(value+" is not divisible by 3");
	}

	}
}
