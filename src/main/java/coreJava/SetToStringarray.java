package coreJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetToStringarray {

	public static void main(String[] args) {
		
		Set<String> phones = new HashSet<String>();
		
		phones.add("iphone");
		phones.add("Mi");
		phones.add("vivo");
		phones.add("samsung");
		System.out.println(phones.add("oneplus"));
		System.out.println(phones.add("oneplus"));
		
		Iterator<String> iterator = phones.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
		
		System.out.println("*****************************");
		String mbls[] = new String[phones.size()];
		
		String[] allphones = phones.toArray(mbls);
		
		for (String phnames : allphones) {
			System.out.println(phnames);
		}
		
	}

}
