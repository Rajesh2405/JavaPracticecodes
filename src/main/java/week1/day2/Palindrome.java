package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		// Method 1 using traditional way
		String name = "Oklahoma";
		
		String rev = "";
		
		for (int i = name.length()-1; i >=0; i--) {
			
			rev = rev+name.charAt(i);
			
		}
		System.out.println(rev);
		
		if (name.equals(rev)) {
			
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String not an palindrome");
		}
		
		// Method 2 using Stringbuffer class
		StringBuffer checkstr =new StringBuffer(name);
		
		System.out.println(checkstr.reverse());
		
		if (name.equals(checkstr.reverse())) {
			
			System.out.println("Palindrome stringbuffer");
		}
		else {
			System.out.println("Not palindrome stringbuffer");
		}
	}
}