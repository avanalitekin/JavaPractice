package collectionsReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapCybertek {

	public static void main(String[] args) {
				
		Map<String, Integer> countryMedals=new HashMap<>();
		countryMedals.put("USA", 28);
		countryMedals.put("UK", 20);
		countryMedals.put("France", 15);
		countryMedals.put("Italy", 11);
		
		System.out.println(countryMedals);
		System.out.println(countryMedals.keySet());
		
		System.out.println("counrtyMedals.get(\"USA\") "+countryMedals.get("USA"));
		Integer italyMedal=countryMedals.get("Italy");
		
		System.out.println(italyMedal);
		countryMedals.replace("Italy", 50);
		System.out.println(countryMedals);
		
		System.out.println(countryMedals.remove("Italy"));
		System.out.println(countryMedals);
		
		countryMedals.put("Italy", 10);
		System.out.println(countryMedals);
		
		System.out.println("\n \n \n");
		Map<Long, String> products=new HashMap<>();
		
		products.put(1L, "shampoo");
		products.put(3L, "tissue-paper");
		products.put(4L, "bleach");
		products.put(6L, "soap");
		
		System.out.println(products);
		products.put(3L, "deodorant");
		System.out.println();
		
		System.out.println(products);
		products.put(5L, "deodorant");
		System.out.println();
		
		products.remove(6L);
		System.out.println(products);
		System.out.println();
		
		Set<Long> allKeys=products.keySet();
		System.out.println(allKeys);
		System.out.println();
		
		Collection<String> allValues=products.values();
		System.out.println(allValues);
		System.out.println();
		
		
		
		
	}

}
