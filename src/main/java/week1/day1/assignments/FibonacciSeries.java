package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input = 8;
		
		int f = 0;
		
		int s = 1;
		int third = 0;
		for (int i = 1; i <=input; i++) {
			
		 third = f + s;
			
			f= s;
			s = third;
			
			System.out.print(third);
			
		}

	
		/*
		 * int range =8, firstNumber = 0, secondNumber =1, sum=0;
		 * 
		 * System.out.println(firstNumber+" "+secondNumber);
		 * 
		 * for (int i=2; i <range; i++) {
		 * 
		 * sum = firstNumber + secondNumber;
		 * 
		 * firstNumber = secondNumber;
		 * 
		 * secondNumber = sum;
		 * 
		 * System.out.println(" "+sum); }
		 */
		
	}

}
