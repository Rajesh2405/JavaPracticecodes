package week1.day2.assignments;

public class SmallestandLargest {

	public static void main(String[] args) {

		int input[]	= {10,2,34,23,17,56,38,90,8,167,51,-10};
		
		int smallest = input[0];
		int largest  = input[0];
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i]<smallest) smallest = input[i];
			
			if(input[i]>largest) largest = input[i];
				
			}
	
		System.out.println("The smallest value in the array "+smallest);
		System.out.println("The largest value in the array "+largest);	
		}
		
		
	}


