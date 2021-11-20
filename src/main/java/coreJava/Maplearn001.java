package coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maplearn001 {

	public static void main(String[] args) {

		
		Map<String, Integer> mapv = new HashMap<String, Integer>();

		mapv.put("samsung", 24000);
		mapv.put("iphone", 124000);
		mapv.put("oneplus", 54000);
		mapv.put("Redmi", 34000);
		
		// To get the product based on condition // Entryset will return the combination of key&value
		//method using Entryset
		for (Entry<String, Integer> eachentry : mapv.entrySet()) {
			
			Integer eachvalue = eachentry.getValue();
			if (eachvalue >20000 && eachvalue <50000) {
				
				System.out.println(eachentry.getKey()+"-->"+eachvalue);
				
			}
			
		}
		
		System.out.println("**********************************************");
		//Method 2 using keyset to retrive the value based on condition (Keyset return keys)
		
		Set<String> keySet = mapv.keySet();
		
		for (String eachkey : keySet) {
			Integer eachv = mapv.get(eachkey);
			if (eachv > 50000 && eachv<100000) {
				
				System.out.println(eachkey+"-->"+eachv);
				
			}
		}
		
		
	}

}
