package week1.day1.assignments;

public class Factorial {


	public static void main(String[] args) {

		int number = 15;
		
		int fact =1;
		
		for (int i = 1; i<=number; i++) {
			
			fact = fact*i;
			
		}
		
		System.out.println(fact);

	}

}
