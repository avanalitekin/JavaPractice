package collectionsReview;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector numbers=new Vector();
		for(int i=0; i<10; i++) {
			numbers.addElement(i);
		}
		System.out.println(numbers);
		//Enumaration is applicable classes only.
		System.out.println("============= print VECTOR elements by ENUMARATION =================");
		Enumeration e=numbers.elements();
		while(e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();
			System.out.print(i+" ");
		}
		
		System.out.println("\n============= print VECTOR elements by ITERATOR =================");
		
		Iterator iterator=numbers.iterator();
		while(iterator.hasNext()) {
			Integer i=(Integer)iterator.next();
			System.out.print(i+" ");
		}

}
}
