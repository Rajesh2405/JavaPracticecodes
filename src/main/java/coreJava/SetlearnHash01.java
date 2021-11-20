package coreJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetlearnHash01 {

	public static void main(String[] args) {

		Set <String> objs = new HashSet<String>();
		
		objs.add("Lion");
		objs.add("Tiger");
		objs.add("Cheeta");
		objs.add("Deer");
		objs.add("Anaconda");
		
		System.out.println(objs);
		
		objs.add("Monkey");
		
		for (String animals : objs) {
			System.out.println(animals);
		}	
			
		
	}

}
