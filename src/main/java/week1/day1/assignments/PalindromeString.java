package week1.day1.assignments;

public class PalindromeString {

	public static void main(String[] args) {

		String stringinput = "millionaire";
		
		String reverse = "";
		
		
		System.out.println(stringinput.indexOf('i'));
		
		System.out.println(stringinput.indexOf('i', (stringinput.indexOf('i'))+1));
		System.out.println(stringinput.indexOf('i', (stringinput.indexOf('i', (stringinput.indexOf('i'))+1))));

		for (int i = stringinput.length()-1; i >=0; i--) {
			
			
		reverse = reverse+stringinput.charAt(i);
		}
		System.out.println(reverse);
		if (stringinput.equals(reverse)) {
			
			System.out.println("Given string is palindrome");
			
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
		
	}

}
