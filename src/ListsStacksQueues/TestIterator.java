package ListsStacksQueues;

import java.util.*;

public class TestIterator {

	public static void main(String[] args) {
	
		Collection<String> cities=new  ArrayList<>();
		cities.add("New York");
		cities.add("Atlanta");
		cities.add("Dallas");
		cities.add("Madison");
		System.out.println(cities);
		
		Iterator<String> iterator=cities.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
		System.out.println();
		System.out.println(cities);
		
		System.out.println();
		for(String city:cities) {
			System.out.print(city.toUpperCase()+" ");
		}
	}

}
