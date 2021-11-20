package coreJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurenceofeachcharacters {

	public static void main(String[] args) {
		
		String str = "A positive mindset brings positive things";
		
		getcharcount(str);
		getcharcountchararray(str);
	}
	//chararrya method
	public static void getcharcountchararray(String str) {
		
		char[] stchr = str.toCharArray();
		Map<Character, Integer> map	=new LinkedHashMap<Character, Integer>();
		
		for (char arrchar : stchr) {
			
			if (map.containsKey(arrchar)) {
				map.put(arrchar, map.get(arrchar)+1);
			}
			else {
				
				map.put(arrchar, 1);
			}
		}
		
		System.out.println(map);
	}
	
	//charat method
	public static void getcharcount(String str) {
		
		Map<Character, Integer> map	=new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i <str.length(); i++) {
			
			if (map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(map);
	}
	

}
