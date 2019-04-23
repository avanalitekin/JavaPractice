package collectionsReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionCybertek05 { //MapWithMultipleValue
	public static void main(String[] args) {
		
	Map<String, List<String>> groupMap=new HashMap<>();
	
	List<String> list1=Arrays.asList("Ali", "Veli", "Selami");
	List<String> list2=Arrays.asList("Mark", "Tom");
	List<String> list3=Arrays.asList("Tim", "Chris", "John");
	groupMap.put("list1", list1);
	groupMap.put("list2", list2);
	groupMap.put("list3", list3);
	
	System.out.println(groupMap);
	
	System.out.println(groupMap.get("list3"));
	System.out.println(groupMap.get("list3").get(1));
	
	
	
	
}
}