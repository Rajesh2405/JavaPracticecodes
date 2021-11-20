package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Setlearnlinked01 {

	public static void main(String[] args) {
		//LinkedHashset implementation
		//Set <String> objs = new LinkedHashSet<String>();
		
		//Treeset implementation
		Set <String> objs = new TreeSet<String>();
		
		objs.add("Peacock");
		System.out.println(objs.add("Eagle"));
		objs.add("Pigeon");
		objs.add("Owl");
		objs.add("Sparrow");
		
		System.out.println(objs);
		
		objs.add("Falcon");
		System.out.println(objs.add("Eagle"));
		
		for (String birds : objs) {
			System.out.println(birds);
		}	
			
		List <String> listobj = new ArrayList<String>(objs);
		
		System.out.println(listobj);
		
		//method 2
		/*
		 * listobj.addAll(objs); 
		 * System.out.println(listobj);
		 */
	}

}
