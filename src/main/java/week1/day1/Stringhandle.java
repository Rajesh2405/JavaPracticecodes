package week1.day1;

public class Stringhandle {	

	
	String s =  "  Orange  ";
	
	
	public void strinngPractice() {

		System.out.println("Before trim "+s.length());
		System.out.println("After trim "+s.trim().length());
		System.out.println(s.trim().toUpperCase());
		System.out.println(s.trim().toLowerCase());
		System.out.println(s.trim().charAt(0));
	}
	
	
	
	public static void main(String[] args) {

		Stringhandle o = new Stringhandle();
		
		o.strinngPractice();
		
		
		/*
		 * int trim = o.s.trim().length();
		 * 
		 * System.out.println("After trimed "+trim);
		 * 
		 * System.out.println("String length is :"+o.s.length());
		 */
		
	}

}
