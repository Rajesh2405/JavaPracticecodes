package week1.day1.assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Armstrongnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num");

		int og = sc.nextInt();

		// check the value given is armstrong or not, Given num sum of the value should be
		// equal to the input 5*5*5,6*6*6,4*4*4 =564?

		int sum = 0; // created one var to store calculated values

		int n = og; // Assigned the org value to temporarily created var to perform calculation

		while (n > 0) {

			int rem = n % 10; // 564%10 = 4, 56%10 = 6, 5%10 =5

			sum = sum + (rem * rem * rem); // 4*4*4 = 64 + 6*6*6 = 216 + 5*5*5 = 125 sum = 405

			n = n / 10; // 564/10 = 56, 56/10 = 5

		}

		System.out.println(sum);
		System.out.println(og);

		if (sum == og) {

			System.out.println("Given " + og + " is a Armstrong number");
		} else {
			System.out.println("Given " + og + " is not a Armstrong number");
		}

	}

}
