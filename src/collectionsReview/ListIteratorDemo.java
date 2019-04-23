package collectionsReview;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList numbers=new ArrayList();
		for(int i=0; i<10; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		ListIterator listIterator=numbers.listIterator();
		while(listIterator.hasNext()) {
			Integer i=(Integer)listIterator.next();
//			System.out.print(i+" ");
			if(i%2==0) {
				listIterator.remove();
			}else {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(numbers);
	}

}
