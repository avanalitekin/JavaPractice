package ListsStacksQueues;

import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.offer("Oklahoma");
		queue1.offer("Indiana");
		queue1.offer("Georgia");
		queue1.offer("Texas");
		System.out.println("queue1: "+queue1);
		System.out.println("Priority queue using Comparable:");
		while (queue1.size() > 0) {
			System.out.println("queue1 remove: "+queue1.remove() + " ");
			System.out.println("queue1: "+queue1);
		}
		
		PriorityQueue<String> queue2 = new PriorityQueue(Collections.reverseOrder());//(4, Collections.reverseOrder())
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		queue2.offer("Missouri");
		System.out.println("\nqueue2: "+queue2);
		System.out.println("Priority queue using Comparator:");
		while (queue2.size() > 0) {
			System.out.println("queue1: "+queue2.remove() + " ");
			System.out.println("queue1: "+queue2);
		}
	}
}