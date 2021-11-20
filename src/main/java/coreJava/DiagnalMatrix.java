package coreJava;

public class DiagnalMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},
				     {2,3,4,6},
				     {2,4,5,2},
				     {2,4,5,2}};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.println(a[i][j]);
				}
			}
		
		}
		
	}

}
