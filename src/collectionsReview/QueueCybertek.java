package collectionsReview;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCybertek {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<Integer>();
		que.add(8);
		que.add(2);
		que.add(3);
		que.add(4);
		que.add(5);
		que.add(6);
		que.add(7);
	
		System.out.println("========== Remove one at a time from PriorityQueue Class ===========");
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
//		System.out.println(que.remove());//java.util.NoSuchElementException
		
		System.out.println("========== Remove one at a time from LinkedList Class ===========");
		Queue<Integer> que2=new LinkedList<Integer>();
		que2.add(8);
		que2.add(2);
		que2.add(3);
		que2.add(4);
		que2.add(5);
		que2.add(6);
		que2.add(7);
			
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		System.out.println(que2.remove());
		System.out.println(que2);
		}
}
