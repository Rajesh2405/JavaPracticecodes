package week1.day1;

public class OddOrEven {

	public static void main(String[] args) {
	
		
		int input = 26;
		
		if (input % 2 ==0){
		
		System.out.println("is an even number");}
		
		else {
			System.out.println("is an odd number");}
		
		//want to verify all odd numbers in a series from 1 to 10
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 1) {
				
				System.out.println("Odd number "+i);
				
			}
			else {
				System.out.println("Even number "+i);
			}
			
		}
		
		int a[] = {1,2,3,5,4,7,8,10};
		
		int alength = a.length;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2==1) {
				System.out.println("These numbers are Odd from given array "+a[i]+",");	
			}
			
			}
		}
			
		}
		

	


