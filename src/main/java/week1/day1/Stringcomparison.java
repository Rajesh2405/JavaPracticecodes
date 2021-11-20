package week1.day1;

public class Stringcomparison {
	
	String s = "This my testing world";
	
	String s1 = "My Testing world";
	
	public void strMethod1() {
		
		
		System.out.println(s.substring(s.length()-5,s.length()));
		System.out.println(s1.substring(s1.length()-5, s1.length()));
		
		
		if (s.substring(s.length()-13, s.length()).equalsIgnoreCase((s1.substring(s1.length()-13,s1.length())))){
			
			System.out.println("String is same");
		}
		else {
			System.out.println("String is not same");
		}
	}

	public static void main(String[] args) {
		
		

		Stringcomparison stobj	= new Stringcomparison();
		
		stobj.strMethod1();
	}

}
