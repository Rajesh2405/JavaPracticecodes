package week1.day2;

public class Sumofdigits {

	public static void main(String[] args) {

		int input = 1234;
		
		int sum = 0; // sum value starts with 0
		
		
		while (input > 0 ) {
			
			int rem = input	% 10;   
			
			sum = sum+rem;
			
			 input = input / 10;
		}
		
     System.out.println(sum);	

	}

}
