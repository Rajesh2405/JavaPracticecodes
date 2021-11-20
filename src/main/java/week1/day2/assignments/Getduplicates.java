package week1.day2.assignments;

public class Getduplicates {

	public static void main(String[] args) {

		int[] iva	= {12,16,12,20,36,30,20,24,22};
		int count = 0;
		for (int i = 0; i < iva.length; i++) {
			for (int j = i+1; j < iva.length; j++) {
				
				if (iva[i]==iva[j] && i!=j) {
					
					System.out.println(iva[j]);
					
					count++;
				}
			}
		}
		System.out.println("duplicated "+count+" times");
	}

}
