package coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringtoMap {

	public static void main(String[] args) {
		
		
		String str ="i love my country";
		
		String[] stsplit = str.split(" ");
		
		Map<String, Integer> map	= new LinkedHashMap<String, Integer>();
		
		for (String string : stsplit) {
		
			if (map.containsKey(string)) {
				
			Integer stvalue = map.get(string);
			map.put(string, stvalue+1);
			}
			else {
				map.put(string, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
