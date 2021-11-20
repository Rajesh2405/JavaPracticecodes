package coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maplearn002 {

	public static void main(String[] args) {
		
		Map<String, Integer> mpv = new LinkedHashMap<String, Integer>();
		
		String str = "I love automation testing and java and with selenium";
		
		String[] spstr = str.split(" ");
		
		for (int i = 0; i <spstr.length; i++) {
			
			
			
			if (mpv.containsKey(spstr[i])) {
				
				//Integer value = mpv.get(spstr[i]);
				mpv.put(spstr[i],mpv.getOrDefault(spstr[i], 0)+1);
				
			}
			else {
				mpv.put(spstr[i], 1);
			}
			
		}
		System.out.println(mpv);
	}

}
