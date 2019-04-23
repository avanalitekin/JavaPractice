package ListsStacksQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class StaticMethodsForListsAndCollections {

	public static void main(String[] args) {
		List<String> colors=Arrays.asList("red", "blue", "green");
		System.out.println(colors);
		System.out.println("============= Collections.sort()===========");
		
		Collections.sort(colors); //sorts in ascending order
		System.out.println(colors);

		System.out.println("============= Collections.sort(colors, Collections.reverseOrder())===========");
		Collections.sort(colors, Collections.reverseOrder());//sorts in descending order
		System.out.println(colors);
		
		System.out.println("============= Collections.sort(colors, Collections.reverseOrder() 2nd time (DOES NOT CHANGE THE ORDER)===========");
		Collections.sort(colors, Collections.reverseOrder());//sorts in descending order
		System.out.println(colors);
				
		System.out.println("============= Collections.reverse()===========");
		Collections.reverse(colors);//reverses previous order
		System.out.println(colors);
		
		System.out.println("============= Collections.reverse() 2nd time ===========");
		Collections.reverse(colors); //reverses previous order
		System.out.println(colors);
		
		System.out.println("============= BinarySearch  numbers ===========");
		List<Integer> binSearchNumbers=Arrays.asList(9,1,6,7,3,8,2,99,20,50);
		System.out.println(binSearchNumbers);
		System.out.println("Index of 7 before sort: "+Collections.binarySearch(binSearchNumbers, 7));
		System.out.println("Index of 9 before sort: "+Collections.binarySearch(binSearchNumbers, 9));
		Collections.sort(binSearchNumbers);
		System.out.println(binSearchNumbers);
		System.out.println("Index of 7 after sort: "+Collections.binarySearch(binSearchNumbers, 7));
		System.out.println("Index of 9 after sort: "+Collections.binarySearch(binSearchNumbers, 9));
		
		System.out.println("============= BinarySearch  String ===========");
		
		List<String> binSearchColors=Arrays.asList("yellow", "blue", "orange", "red", "green");
		System.out.println("list before sort: "+binSearchColors);
		System.out.println("Index of yellow before sort: "+Collections.binarySearch(binSearchColors, "yellow"));
		System.out.println("Index of green before sort: "+Collections.binarySearch(binSearchColors, "green"));
		Collections.sort(binSearchColors);
		System.out.println("list after sort: "+binSearchColors);
		System.out.println("Index of yellow after sort: "+Collections.binarySearch(binSearchColors, "yellow"));
		System.out.println("Index of green after sort: "+Collections.binarySearch(binSearchColors, "green"));
		
		System.out.println("=============ShuffleList ===========");
		System.out.println("list before shuffle: "+binSearchColors);
		System.out.println("list before shuffle: "+binSearchNumbers);
		Collections.shuffle(binSearchColors);
		Collections.shuffle(binSearchNumbers);
		System.out.println("list after shuffle1: "+binSearchColors);
		System.out.println("list after shuffle1: "+binSearchNumbers);
		Collections.shuffle(binSearchColors);
		Collections.shuffle(binSearchNumbers);
		System.out.println("list after shuffle2: "+binSearchColors);
		System.out.println("list after shuffle2: "+binSearchNumbers);
		
		System.out.println("=============Shuffle pair of  identical list ===========");
		List<String> shuffleColors1=Arrays.asList("yellow", "blue", "orange", "red", "green", "white", "purple");
		List<String> shuffleColors2=Arrays.asList("yellow", "blue", "orange", "red", "green", "white", "purple");
		
		System.out.println("suffleColors1 before shuffle"+shuffleColors1);
		System.out.println("suffleColors2 before shuffle"+shuffleColors2);
		
		Collections.shuffle(shuffleColors1,new Random(20));//Random will maintain  the same result in both list
		Collections.shuffle(shuffleColors2,new Random(20));//Random will maintain  the same result in both list
		
		System.out.println("suffleColors1 after shuffle"+shuffleColors1);
		System.out.println("suffleColors2 after shuffle"+shuffleColors2);
		System.out.println();
		System.out.println("=============Shuffle pair of  identical list ===========");
		List<String> copyColors1=Arrays.asList("yellow", "orange", "purple", "brown", "green", "violet", "gray");
		List<String> copyColors2=Arrays.asList("black", "white");
		System.out.println("copyColors1 before copy: "+copyColors1);
		System.out.println("copyColors2 before copy: "+copyColors2);
		Collections.copy(copyColors1, copyColors2); //colors2 replaces the items in color1 starting the first element.
		System.out.println("copyColors1 after copy: "+copyColors1);
		System.out.println("copyColors2 after copy: "+copyColors2);
		
		System.out.println("=========== Collections.nCopies() ============");
		
		copyColors2 = Collections.nCopies(10, "gray");
		System.out.println(copyColors2);
		List<String> nCopiesList=Collections.nCopies(5, "printer");
		System.out.println(nCopiesList);
		System.out.println("=========== System.out.println(binSearchNumbers); ============");
		System.out.println(binSearchNumbers);
		System.out.println("===System.out.println(binSearchNumbers) === after Collections.fill(binSearchNumbers, 100);=====");
		Collections.fill(binSearchNumbers, 100);
		System.out.println(binSearchNumbers);
//		binSearchNumbers.add(100); // Collections.fill() method makes the list immutable
//		System.out.println(binSearchNumbers);
//		nCopiesList.add("copier");//Collections.nCopies() method makes the list immutable
//		System.out.println(nCopiesList);
		System.out.println("=========== Collections.max() ============");
		System.out.println("copyColors1: "+copyColors1);
		System.out.println("Collections.max(copyColors1): "+Collections.max(copyColors1));
		System.out.println("Collections.min(copyColors1): "+Collections.min(copyColors1));
		
		List<Integer> numbers=Arrays.asList(9,1,6,7,3,8,2,99,20,50);
		System.out.println("numbers: "+numbers);
		System.out.println("Collections.max(numbers): "+Collections.max(numbers));
		System.out.println("Collections.min(numbers): "+Collections.min(numbers));
		
		System.out.println("=========== Collections.disjoint() ============");
		
		System.out.println("Collections.disjoint(copyColors1, numbers): "+Collections.disjoint(copyColors1, numbers));
		System.out.println(copyColors1);
		System.out.println(copyColors2);
		
		System.out.println("Collections.disjoint(copyColors1, copyColors2): "+Collections.disjoint(copyColors1, copyColors2));
		
		System.out.println("=========== Collections.frequency() ============");
		System.out.println("Collections.frequency(copyColors2, \"gray\"): "+Collections.frequency(copyColors2, "gray"));
		System.out.println("Collections.frequency(copyColors2, \"blue\"): "+Collections.frequency(copyColors2, "blue"));
		

		
		
	}

}
