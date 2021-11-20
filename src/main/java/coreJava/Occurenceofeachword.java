package coreJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurenceofeachword {

	public static void main(String[] args) {
		
		String str = "A positive mindset brings positive things wish everyone needs to be positive";
		
		getcharcount(str);
		getcharcountchararray(str);
		basket();
	}
	//chararray method
	public static void getcharcountchararray(String str) {
		
		String[] stspl = str.split(" ");
		Map<String, Integer> map	=new LinkedHashMap<String, Integer>();
		
		for (String eachword : stspl) {
			
			if (map.containsKey(eachword)) {
				map.put(eachword, map.get(eachword)+1);
			}
			else {
				
				map.put(eachword, 1);
			}
		}
		
		System.out.println(map);
	}
	
	//charat method
	public static void getcharcount(String str) {
		
		String[] stspl = str.split(" ");
		Map<String, Integer> map	=new LinkedHashMap<String, Integer>();
		
		for (int i = 0; i <stspl.length; i++) {
			
			if (map.containsKey(stspl[i])) {
				
				map.put(stspl[i], map.get(stspl[i])+1);
			}
			else {
				map.put(stspl[i], 1);
			}
			
		}
		System.out.println(map);
	}
	
	public static void basket() {
		
		
		String[] colourBasket = {"Yellow","Red","Blue","Yellow","Blue","Red","Blue"};
		
		
		Map<String, Integer> comap	= new LinkedHashMap<String,Integer>();
		
		for (String string : colourBasket) {
		
			if (comap.containsKey(string)) {
				
			comap.put(string,comap.get(string)+1);
			}
			
			else {
				comap.put(string, 1);
			}
		}
		
		System.out.println(comap);
		
	}
	

}
