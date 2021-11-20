package week1.day1;

public class StartSpace {

	
	public void printStar() {
		for (int i = 1; i<=6;i++) {
			for (int j =1; j<=5; j++) {
				
				if (j>1 && j <5 && i!=1 && i!=6) {
					
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		StartSpace obj = new StartSpace();
		obj.printStar();
		
	}
}


