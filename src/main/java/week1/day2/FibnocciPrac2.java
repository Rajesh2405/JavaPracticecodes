package week1.day2;

public class FibnocciPrac2 {

	public static void main(String[] args) {

		int i1 = 0;
		
		int i2 = 1;
		
		
		for (int i = 1; i <=12; i++) {
			
			int i3 = i1 + i2;
			System.out.println(i3);
			
			i1 = i2;
			
			i2 = i3;
			
		}
		
		
	}

}
