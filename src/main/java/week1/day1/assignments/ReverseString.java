package week1.day1.assignments;

public class ReverseString {

	public static void main(String[] args) {

		String st = "Good things coming through";
		
		String rev ="";
		// used to charat method
		/*
		 * int len = st.length();
		 * 
		 * for (int i = len-1; i>=0; i--) {
		 * 
		 * rev = rev+st.charAt(i); }
		 */
		
		// used char array method
		
		char[] ar =st.toCharArray();
		
		int len = ar.length;
		
		for (int i = len-1; i >=0; i--) {
			
			rev =rev+ar[i];
		}
			
		System.out.println("Reversed String: "+rev);
		
		StringBuffer sb = new StringBuffer(st);
		
		System.out.println("String buffer reversed :"+sb.reverse());
		
	}
}
