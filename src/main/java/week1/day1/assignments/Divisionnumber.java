package week1.day1.assignments;

public class Divisionnumber {
	
	
	public void findNumDivisble(int a) {

		if (a%5 == 0  && a%11 == 0) {
			
			System.out.println("divisible by both");
		}
		else if (a%5 == 0) {
			System.out.println("divisible by only 5");
		}
		else if (a%11 == 0) {
			System.out.println("divisible by only 11");
		}
		else {
			System.out.println("Not divisible by any");
		}
		
		
	}

	public static void main(String[] args) {
		
		Divisionnumber obj = new Divisionnumber();
		
		obj.findNumDivisble(98);
		obj.findNumDivisble(55);
		obj.findNumDivisble(21);
		obj.findNumDivisble(33);
		
			
	}

}
