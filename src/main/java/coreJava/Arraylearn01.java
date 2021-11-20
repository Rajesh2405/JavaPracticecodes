package coreJava;

import java.util.Arrays;

public class Arraylearn01 {

	public static void main(String[] args) {

		int age[] = { 21, 23, 42, 31, 29, 28 };

		int lenages = age.length;

		Arrays.sort(age);

		for (int i = 0; i < lenages; i++) {

			System.out.println(age[i]);
		}

		System.out.println("*********************");

		String[] names = new String[5];

		names[0] = "Vijay";
		names[1] = "Ajith";
		names[2] = "Rajini";
		names[3] = "Kamal";
		names[4] = "Vikram";
		
	
		Arrays.sort(names);

		for (String actname : names) {

			System.out.println(actname);
		}
		
		System.out.println("******Using for loop****");
		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);

		}

	}
}
