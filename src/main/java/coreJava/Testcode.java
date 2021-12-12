package coreJava;

public class Testcode {

	String str = "Welcome";
	
	 String str1 ="Welcome";
	
	String str2 = new String("Welcome");
	
	
	public static void main(String[] args) {
		
		Testcode obj = new Testcode();
		
		System.out.println(obj.str==obj.str1);// Expected True
		System.out.println(obj.str.equals(obj.str1));// Expected True
		System.out.println(obj.str==obj.str2); // Expected False
		System.out.println(obj.str.equals(obj.str2)); //Expected True
		
		String s= "Hello";
		
		s = "hi";
		
		System.out.println(s);
		
		
	}
}
