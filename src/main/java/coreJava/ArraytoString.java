package coreJava;

import java.util.Arrays;

public class ArraytoString {

	public static void main(String[] args) {
		
		char []arr	= {'R','a','j','e','s','h'};
		
		String arrtostring = Arrays.toString(arr);
		
		System.out.println(arrtostring);
		
		
		StringBuilder sbr = new StringBuilder("Test Lead");
		
		System.out.println(sbr.append(" Rajeshkumar"));
		
		
	}

}
