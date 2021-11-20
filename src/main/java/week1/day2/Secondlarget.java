 package week1.day2;


public class Secondlarget {


	public static int secondlarge(int []a, int total) {
		
		int temp;
		
			for (int i = 0; i < total; i++) {
				
				for (int j = i+1; j < total; j++) {
					
					if (a[i]> a[j]) {
						
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						
					}
				}
				
			}

		return a[total-2];
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,10,8,9};
		
		int b[]	= {45,34,23,89,76,82};
		
		int c[]	= {12, 13, 14, 23};
		
		System.out.println("secondlargest: "+secondlarge(a,7));
		System.out.println("secondlargest: "+secondlarge(b,6));
		System.out.println("secondlargest: "+secondlarge(c,4));
		
	}
	}
		
		
		
		
		
	
	


