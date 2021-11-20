package coreJava;

public class MatrixAddition {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{2,3,4},{3,2,2}};
		
		int b[][]= {{1,2,3},{2,3,4},{3,2,1}};
		
		int c[][]= new int [a.length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				c[i][j]= a[i][j] + b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}
}
