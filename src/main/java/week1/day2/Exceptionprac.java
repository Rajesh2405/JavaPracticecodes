	package week1.day2;

public class Exceptionprac {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 2;
		
		int c;
		
		int []ar = {1,2,4,5};
		
		try {
			c = a/b;
			System.out.println(c);
			System.out.println(ar[5]);
		} catch (Exception e) {
		System.out.println(e);
		}
		
		finally {
			System.out.println("im finally");
		} 
		
		System.out.println("Testing exception");
	}

}
