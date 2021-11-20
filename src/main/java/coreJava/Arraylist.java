package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		
		List <String> li = new ArrayList<String>();
		
		li.add("TN");
		li.add("KL");
		li.add("KT");
		li.add("AP");
		
		System.out.println(li);
		System.out.println(li.size());
		li.add(2, "MH");
		li.remove(3);
		System.out.println(li);
		System.out.println(li.indexOf("TN"));
		System.out.println(li.get(0));
		System.out.println(li.listIterator());
		li.removeAll(li);
		System.out.println(li.isEmpty());
		
		
		
		
		
		//Converting String arrays to List, Arraylist
		String[] str = {"testing","selenium","cucumber"};
		
		//convert string to arraylist
		String str1 ="It is a good day";	
		
		//step 1
		String[] stoarr = str1.split("");
		
		//method 1
		List <String>newlst = new ArrayList<String>(Arrays.asList(stoarr));
		
		for (String strtoarray : newlst) {
			
			System.out.println(strtoarray);
		}
		
		//method 2
		LinkedList<String> arrL	=  new LinkedList<String>(Arrays.asList(str));
		for (String string : arrL) {
			System.out.println(string);
		}
		//method 3
		
		ArrayList<String> narr = new ArrayList<String>(Arrays.asList(str));
		
		for (Object s : narr) {
			
			System.out.println("["+s+"]");
		}
	
}
}
