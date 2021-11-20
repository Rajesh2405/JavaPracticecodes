package week1.day1.assignments;

public class Primenumber {

	public static void main(String[] args) {
		
		
		int Input = 5;
		
		int count = 0;

		for (int i = 1; i <= Input ; i++) {

			if ((Input % i) == 0) {

				count = count + 1;

			}
		}

		if (count == 2) {

			System.out.println(Input+" is"+" Prime Number");

		}

		else {

			System.out.println(Input+" is"+" Not a Prime Number");
		}
		
	}

}
