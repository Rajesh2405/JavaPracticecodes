package coreJava;

public class TwodimeArray {

	public static void main(String[] args) {

		String two[][] =new String[3][3];
		
		System.out.println(two.length);
		System.out.println(two[0].length);
		//1 st row
		two[0][0] = "A";
		two[0][1] = "B";
		two[0][2] = "C";
		//2nd row
		two[1][0] = "A1";
		two[1][1] = "B1";
		two[1][2] = "C1";
		//3rd row
		two[2][0] = "A2";
		two[2][1] = "B2";
		two[2][2] = "C2";
		
		System.out.println(two[0][0]);
		
		for (int i = 0; i < two.length; i++) {
			
			for (int j = 0; j < two[0].length; j++) {
				
				System.out.println(two[i][j]);
				
			}
		}
		
		
		
	}

}
