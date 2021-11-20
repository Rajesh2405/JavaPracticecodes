package week1.day1;

public class Findnumbervalue {

	
	public void largest(int a, int b, int c) {

		if (a>c && a>b) {
			
			System.out.println("Largest number is "+a);
		}  else if (b>a && b>c) {
			
			System.out.println("Largest number is "+b);
			
		}else {
			System.out.println("Largest number is "+c);
		}
	}
	
	public void lowest(int a, int b, int c) {

		if (a<c && a<b) {
			
			System.out.println("Lowest number is "+a);
		}  else if (b<a && b<c) {
			
			System.out.println("Lowest number is "+b);
			
		}else {
			System.out.println("Lowest number is "+c);
		}
	}
	
	public static void main(String[] args) {
		
		Findnumbervalue number = new Findnumbervalue();
		
		number.largest(12, 19, 10);
		number.lowest(9, 8, 6);
	}
		
	}

