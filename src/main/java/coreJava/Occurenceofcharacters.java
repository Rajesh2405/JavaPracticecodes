package coreJava;

public class Occurenceofcharacters {

	public static void main(String[] args) {
		
		String str = "A positive mindset brings positive things";
		char ch = 's';
		
		getcharcount(str, ch);
		getcharcountchararray(str, ch);
	}
	
	public static void getcharcountchararray(String str, char ch) {
		
		int count = 0;
		char[] vcharar = str.toCharArray();
		for (char cval : vcharar) {
			
			if(cval==ch) {
			
			count++;
		}
	}
		System.out.println(ch+":"+count);
	}
	
	public static void getcharcount(String str, char ch) {
		
		int count = 0;
		
		for (int i = 0; i <str.length(); i++) {
			
			if (ch == str.charAt(i)) {
				
				count++;
				
			}
			
		}
		System.out.println(ch+":"+count);
	}
	

}
