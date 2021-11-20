package week1.day1;

import java.util.Arrays;

public class findsecondlar {

	public static void main(String[] args) {

		int data[]	= {3,2,11,4,6,7};
		
		Arrays.sort(data);
	
		  for (int i = 0; i < data.length; i++) {
		  
		   for (int j = 1; j < data.length; j++) {
		  
		   if (data[i] == data [j]) {
		  
		 // System.out.println(data[j]);
		  
		   //System.out.print(data[i]+",");
		  
		 
		 			
		System.out.println("Second largest : "+data[data.length-1]);
			
		}
	
}
		  }
		  
		  
	}
}
	

