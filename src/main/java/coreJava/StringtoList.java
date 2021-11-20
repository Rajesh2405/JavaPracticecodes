package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringtoList {

	public static void main(String[] args) {

		String []arv = {"kolkata","chennai","mumbai","bangalore","delhi","kochin","chennai"};
		
		
		List <String> Stlist = new ArrayList<String>();
		//For loop used to convert Array to list
		for (int i = 0; i < arv.length; i++) {
			Stlist.add(arv[i]);
		}
		
		System.out.println(Stlist);
		
		//For each loop used to convert Array to list
		for (String lisva : arv) {
			Stlist.add(lisva);
		}
		
		//Collections.sort(Stlist);
		//System.out.println(Stlist);
		
		Set <String> stva	= new TreeSet<String>(Stlist);
		
		System.out.println(stva);
		
		// List to String conversion
		String strcon[] = new String[stva.size()];
		
		String[] cnames = stva.toArray(strcon);
		
		for (String settostring : cnames) {
			
			System.out.print("{"+settostring+"}");
		}
		
}
}
