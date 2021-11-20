package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listlearn {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,7,3,2,4,8};
		

		List <Integer> inputlist	= new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					
					inputlist.add(a[j]);
				}
				
			}
		}
			System.out.println(inputlist);
		}
		
	

}