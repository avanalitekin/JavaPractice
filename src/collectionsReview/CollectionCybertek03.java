package collectionsReview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionCybertek03 {

	public static void main(String[] args) {

		String[] names = { "Darben", "Pinkney", "Lamburn", "Secretan", "Cawse", "Pinkney", "Martynikhin", "Oram",
				"Pinkney", "Glaze", "Martynikhin", "John", "Adam", "Zack" };
		System.out.println("============= Put all names into a list ====================");
		List<String> namesList = Arrays.asList(names);
		System.out.println(namesList);
		System.out.println("============= Iterate over the list ====================");
		Iterator name = namesList.iterator();
		System.out.println();
		while (name.hasNext()) {
			System.out.print(name.next() + " ");

		}
		System.out.println("============= Unique Elements list and unique element number ====================");
		SortedSet<String> uniqueNames = new TreeSet<>(namesList);
		System.out.println(namesList);
		System.out.println(uniqueNames.size());

		System.out.println("============= Elements form K to P ====================");
		SortedSet<String> kToPNames = uniqueNames.subSet("K", "q");
		System.out.println(kToPNames);
		
		System.out.println("============= Deleting and element in subset will that affect the original set? ====================");
		System.out.println(uniqueNames);
		System.out.println(kToPNames);
		kToPNames.remove("Oram");
		System.out.println(uniqueNames);
		System.out.println(kToPNames);
		
		System.out.println("============= Frequency of each name ====================");
		Map<String, Integer> nameFrequency=new HashMap<>();
		for(String name2: namesList) {
			if(!nameFrequency.containsKey(name2)) {
				nameFrequency.put(name2,1);
			}else {
				nameFrequency.put(name2, nameFrequency.get(name2)+1);
			}
		}
		System.out.println(nameFrequency);
		
	}
}
