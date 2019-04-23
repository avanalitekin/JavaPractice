package collectionsReview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionCybertek06 {
	public static void main(String[] args) {
	String[] names = { "Darben", "Pinkney", "Lamburn", "Secretan", "Cawse", "Pinkney", "Martynikhin", "Oram",
			"Pinkney", "Glaze", "Martynikhin", "John", "Adam", "Zack" };
	Arrays.sort(names);
	System.out.println("========= String[] names=========");
	System.out.println(Arrays.toString(names));
	List<String> namesList=Arrays.asList(names);
	Collections.sort(namesList);
	System.out.println("========= List<String> namesList=Arrays.asList(names) =========");
	System.out.println(namesList);
	
	SortedSet<String> namesSet=new TreeSet(namesList);
	System.out.println("========= SortedSet<String> namesSet=new TreeSet(namesList) =========");
	System.out.println(namesSet);
	Map<String, Integer> namesMap= new  HashMap<String, Integer>();
	
	for(String name:namesSet) {
		namesMap.put(name, name.length());
	}
	System.out.println("========= Map<String, Integer> namesMap= new  HashMap<String, Integer>(); =========");
	System.out.println(namesMap);
		
	System.out.println("========= Entry<String, Integer> entry:namesMap.entrySet() =========");
	for(Entry<String, Integer> entry:namesMap.entrySet()) {
		System.out.println(entry.getKey()+" == "+entry.getValue());
	}
}
}