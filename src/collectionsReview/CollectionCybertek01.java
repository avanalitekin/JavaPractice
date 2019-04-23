package collectionsReview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionCybertek01 {

	public static void main(String[] args) {
		List<String> numbers=new ArrayList<String>();
		numbers.add("10");
		numbers.add("2");
		numbers.add("A");
		numbers.add("3");
		numbers.add("Z");
		numbers.add("4");
		numbers.add("8");
		numbers.add("B");
		numbers.add("7");
		System.out.println(numbers);
		System.out.println("ArrayList size: "+numbers.size());
		System.out.println("ArryaList numbers.subList(3, 6): "+numbers.subList(3, 6));
		Set<Integer> uniqueNumbers=new HashSet(numbers);
		System.out.println("HashSet: "+uniqueNumbers);
		
		System.out.println("HashSet size: "+uniqueNumbers.size());	
		
		SortedSet<String> sortedUniqueNumbers=new TreeSet<String>(numbers);
		System.out.println("TreeSet: "+sortedUniqueNumbers);	
		System.out.println("TreeSet sortedUniqueNumbers.subSet(\"2\", \"Z\"): "+sortedUniqueNumbers.subSet("2", "Z"));
		System.out.println("sortedUniqueNumbers.subSet(\"2\", \"Q\"): "+sortedUniqueNumbers.subSet("2", "Q"));
	}
}
