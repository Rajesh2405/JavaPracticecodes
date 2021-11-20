package coreJava;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num");

		int inp = sc.nextInt();

		int ognum = inp;

		int rev = 0;

		while (inp > 0) {

			rev = rev * 10 + inp % 10;

			inp = inp / 10;
		}
		
		System.out.println(rev);

		if (ognum == rev) {

			System.out.println(ognum + "  is a palindrome");

		} else {
			System.out.println(ognum + "  is not a palindrome");
		}

	}

}
