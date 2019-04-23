package ListsStacksQueues;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;


public class TestArrayListAndLinkedList {

	public static void main(String[] args) {
		
		//Advanced for loop can be used both with ArrayList and LinkedList
		//Regular loop with index is very INefficient for LinkedList so do not use it with LinkedList
		
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(3);
		numbers.add(0,10);
		numbers.add(3,50);
		
		System.out.println(numbers);
		numbers.remove(4);
		System.out.println(numbers);
		Iterator<Integer> iterator=numbers.iterator();
		System.out.println("iterator=numbers.iterator();");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println("\nfor(Integer i:numbers) ");
		for(Integer i:numbers) {
			System.out.print(i+" ");
		}
		ListIterator<Integer> listIterator=numbers.listIterator();
		System.out.println("\nListIterator<Integer> listIterator=numbers.listIterator(); ");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
		System.out.println("\n==while(listIterator.hasPrevious())==");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+" ");
		}
		System.out.println("numbers.clear();");
//		numbers.clear();
//		System.out.println(numbers);
		
		System.out.println();
		LinkedList<Object> linkedList=new LinkedList<>(numbers);
		System.out.println(linkedList);
		System.out.println(linkedList);
		linkedList.add(0,"red");
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.addFirst("green");
		System.out.println(linkedList);
		System.out.println("=== for(Object o:linkedList) ===");
		for(Object o:linkedList) {
			System.out.print(o+" ");
		}
		Iterator<Object> iteratorLL=linkedList.iterator();
		System.out.println("\n===Iterator<Object> iteratorLL=linkedList.iterator()====");
		while(iteratorLL.hasNext()) {
			System.out.print(iteratorLL.next()+" ");
		}
		ListIterator<Object> listIterator2=linkedList.listIterator();
		System.out.println("\n===ListIterator<Object> listIterator2=linkedList.listIterator();====");
		while(listIterator2.hasNext()) {
			System.out.print(listIterator2.next()+" ");
		}
		listIterator2=linkedList.listIterator(linkedList.size()-3); //**** This needs attention
		System.out.println("\nlistIterator2=linkedList.listIterator(linkedList.size()-3)== & ==listIterator2.hasPrevious()");
		while(listIterator2.hasPrevious()) {
			System.out.print(listIterator2.previous()+" ");
		}
		
		
		List<String> list1= Arrays.asList("red","green", "blue");
		List<Integer> list2=Arrays.asList(1,2,3,4,5);
		System.out.println("\nList<String> list1= Arrays.asList(\"red\",\"green\", \"blue\");");
		System.out.println(list1);
		System.out.println("List<String> list2= Arrays.asList(1,2,3,4,5);");
		System.out.println(list2);
//		list1.clear();
	
	}

}
