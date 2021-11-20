package week1.day1;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "Java and Selenium is popular for Automation";
		
		String[] split = str.split(" ");
		
		String reversedword = "";
		for (String word : split) {
			
			String reverse = "";
			for (int i = word.length()-1; i>=0; i--) {
				
				reverse = reverse+word.charAt(i);
				
			}
			
			reversedword = reversedword+reverse+" ";
		}
		
		System.out.println(reversedword+" ");
		
		
	}

}
