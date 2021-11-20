package coreJava;

public class PyramidEx {

	public static void main(String[] args) {
		
	practice();
		
		int n = 6;
		
		for (int i = 0; i <=n; i++) {
			
			for (int j = i; j <=n; j++) {
				
				System.out.print("  ");
			}
			for (int j = 1; j <i; j++) {
				System.out.print("* ");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}	

	public static void practice() {
		
		int in = 5;
		
		for (int i = 1; i <= in; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
}
