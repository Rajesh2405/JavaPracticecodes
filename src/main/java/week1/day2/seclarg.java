package week1.day2;

public class seclarg {

	public static void main(String[] args) {

		int [] inp  = {2,3,6,9,12,34,23,27};
		
		int temp;
		
		for (int i = 0; i < inp.length; i++) {
			
			for (int j = i+1; j < inp.length; j++) {
				
				//System.out.println(inp[j]);
				
				if (inp[i]>inp[j]) {
					
					temp = inp[i];
					inp[i] = inp[j];
					inp[j]=temp	;
				}
			}
			
		}
		
		System.out.println(inp[inp.length-2]);
	}
	

}
