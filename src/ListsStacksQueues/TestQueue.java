package ListsStacksQueues;

public class TestQueue {
	public static void main(String[] args) {
		java.util.Queue<String> queue = new java.util.LinkedList<>();
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");
		System.out.println("queue: "+queue);
		while (queue.size() > 0) {
			System.out.println("queue.remove() + \" \": "+queue.remove() + " ");
			System.out.println("queue: "+queue);
	}
	
}
}