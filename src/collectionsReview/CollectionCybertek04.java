package collectionsReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionCybertek04 {

	public static void main(String[] args) {
		Map<String, String> myMap=new HashMap<>();
		myMap.put("1", "a");
		myMap.put("2", "B");
		myMap.put("3", "C");
		myMap.put("4", "D");
		myMap.put("5", "e");
		myMap.put("6", null);
		myMap.put("7", "G");
	System.out.println(myMap);
		
		myMap.replace("5","E");
		System.out.println(myMap);
		
		myMap.putIfAbsent("7", "H");
		
		System.out.println(myMap);
		
		System.out.println(myMap.replace("1", "a", "A"));
		System.out.println(myMap);
	
	System.out.println("============ get values ==================");
	System.out.println("myMap.get(\"1\"): "+myMap.get("1"));
	System.out.println("myMap.get(\"5\"): "+myMap.get("5"));
	System.out.println("myMap.get(\"6\"): "+myMap.get("6"));
	System.out.println("============ Entry ==================");
	
	for (Entry<String, String> entry:myMap.entrySet()) {
		System.out.println(entry.getKey()+"========"+entry.getValue());
		if(entry.getValue()==null) {
			entry.setValue("something else");
		}
	}
	System.out.println(myMap);
	}
}
