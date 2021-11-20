package coreJava;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {


		Set<String> hs = new HashSet<String>();
		
		hs.add("India");
		hs.add("USA");
		hs.add("Aus");
		hs.add("Brazil");
		hs.add("UK");
		hs.add("USA");
		
		System.out.println(hs);
		System.out.println(hs.size());
		hs.clear();
		hs.add("japan");
		System.out.println(hs.isEmpty());	
		hs.retainAll(hs);
		System.out.println(hs);
		
		
	
	}
	
	

}
