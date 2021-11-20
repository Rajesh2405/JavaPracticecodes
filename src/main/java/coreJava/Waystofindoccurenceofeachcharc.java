package coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Waystofindoccurenceofeachcharc {
	
	
	String str = "India is a beautiful country"	;
	
	
	@Test 
	public void method1ForeachwithHashmap() {
		
		char[] charr = str.toCharArray();
		
		Map<Character, Integer> charcounter = new LinkedHashMap<Character, Integer>();
		
		for (char eachar : charr) {
			
			if (charcounter.containsKey(eachar)) {
				
				Integer value = charcounter.get(eachar);
				
				charcounter.put(eachar, value+1);
			}
			else {
				charcounter.put(eachar, 1);
			}
			
		}
		System.out.println(charcounter);
	}
	
	@Test
	public void method2forloopwithHashmap() {
		
		String string = "";
		int temp = 0;
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		for (int i = 0; i < str.length(); i++) {
			
			map.put(temp, ""+str.charAt(i));
			temp++;
			
		}
		
		for (int eachchar : map.keySet()) {
			int count = 0;
			string = map.get(eachchar);
			
			for (Integer eackey : map.keySet()) {
				if (string.equals(map.get(eackey))) {
					count++;
				}
			}
			
			System.out.println(map.get(eachchar)+"-->"+count);
		}
	}
	
	@Test
	public static void chararrayoccurence() {
		
		char ch[] = {'a','c','B','e','D'};
		
		int len = ch.length;
		
		System.out.println(len);
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (map.containsKey(ch[i])) {
				
				Integer valu = map.get(ch[i]);
				map.put(ch[i], valu+1);
			}
		
		
		/*for (char c : ch) {
			
			if (map.containsKey(c)) {
				
				map.put(c, map.getOrDefault(c, map.get(c))+1);
			}*/
			else {
			map.put(ch[i], 1);
		}
	}
		System.out.println(map.size());
		System.out.println(map);
	}
}

