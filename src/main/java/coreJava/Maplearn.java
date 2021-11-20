package coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maplearn {

	public static void main(String[] args) {

		Map<String, Integer> mapv = new HashMap<String, Integer>();

		mapv.put("samsung", 24000);
		mapv.put("iphone", 124000);
		mapv.put("oneplus", null);
		mapv.put("Redmi", 34000);
		mapv.put("Redmi", null);
		mapv.put(null, null);
		mapv.put(null, 15000);

		System.out.println(mapv);

		System.out.println(mapv.get("iphone") + "Rs");

		for (Entry<String, Integer> eachentry : mapv.entrySet()) {

			System.out.println(eachentry);
			//System.out.println(eachentry.getKey() + " - " + eachentry.getValue());

		}
		System.out.println("*******************************");

		Set<String> keySet = mapv.keySet();

		for (String eachkey : keySet) {

			System.out.println(eachkey + "-->" + mapv.get(eachkey));

		}
		System.out.println(mapv.values());
		
		System.out.println(mapv.containsKey("samsung"));
		System.out.println(mapv.containsValue(25000));
		System.out.println(mapv.size());
	}

}
