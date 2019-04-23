package collectionsReview;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		//It  is similar to  HashMap but it is synchronized.
		//stores the value on the basis of key-value pair
		//key is specified as an object, each object has an hashcode, value will be stored on the basis of  the  hashcode.
		//
		
		Hashtable sports=new Hashtable();
		sports.put(1,"football");
		sports.put(2, "soccer");
		sports.put(3, "basketball");
		sports.put(4, "voleyball");
		//clone copy
		Hashtable sports2=new Hashtable();
		sports2=(Hashtable)sports.clone();
		System.out.println("sports: "+sports);
		System.out.println("sports2: "+sports2);
		
		
		sports.remove(4);
		
		System.out.println("sports: "+sports);
		System.out.println("sports2: "+sports2);
		
		System.out.println(sports);
		//get value by key
		System.out.println("================== GET VALUE BY KEY ==================");
		System.out.println(sports.get(1));
		System.out.println("================== CONTAINS() METHOD ==================");
		System.out.println(sports.contains("basketball"));
		System.out.println("================== VALUES() METHOD ==================");
		System.out.println(sports.values());
		System.out.println("================== sports.keys().hashCode() ==================");
		System.out.println(sports.keys().hashCode());
		System.out.println("================== sports.hashCode() ==================");
		System.out.println(sports.hashCode());
		System.out.println("================== sports.values().hashCode() ==================");
		System.out.println(sports.values().hashCode());
		System.out.println("================== sports.get(1).hashCode() ==================");
		System.out.println(sports.get(1).hashCode());
		System.out.println("================== sports.get(3).hashCode() ==================");
		System.out.println(sports.get(3).hashCode());

		
		
		//print values one by enumeration
		
		System.out.println("================== PRINT VALUES BY ENUMERATION ==================");
		Enumeration es1=sports.elements();
		while(es1.hasMoreElements()) {
			System.out.println(es1.nextElement());
		}
		System.out.println();
		Enumeration es2=sports2.elements();
		while(es2.hasMoreElements()) {
			System.out.println(es2.nextElement());
		}
		//get values by using ==entrySet() ====set of hashtable values
		
		System.out.println("================== PRINT KEY-VALUE PAIR BY ENTRYSET() ==================");
		
		Set ss1=sports.entrySet();
		System.out.println(ss1);
		
		//compare if hashtable objects  are equal
		
		Hashtable sports3=new Hashtable();
		sports3.put(1,"football");
		sports3.put(2, "soccer");
		sports3.put(3, "basketball");
		sports3.put(4, "voleyball");
		System.out.println("================== CHECK  IF HASHTABLES ARE EQUAL ==================");
		System.out.println(sports3.equals(sports2));
		System.out.println(sports3.equals(sports));
		
		System.out.println("================== NO NULL KEYS OR VALUES ARE ALLOWED ==================");
//		sports.put(null, "tennis");
//		sports.put(5, null);
		System.out.println("================== NO DUBLICATE KEY ALLOWED ==================");
		sports.put(3, "tennis");
		System.out.println(sports);
		sports.put(3, "soccer"); //DUBLICATE VALUES ARE ALLOWED THOUGH
		System.out.println(sports);
		
		System.out.println("================== GENERIC AS WELL AS NON-GENERIC HASHTABLES ARE ALLOWED ==================");
		
		Hashtable techItems=new Hashtable();
		techItems.put("A", "Phone");
		techItems.put("B", "TV");
		techItems.put("C", "computer");
		techItems.put("D", "watch");
		
		Hashtable<String, String> techItems2=new Hashtable<String, String>();
		techItems2.put("A", "Phone");
		techItems2.put("B", "TV");
		techItems2.put("C", "computer");
		techItems2.put("D", "watch");
		
		System.out.println(techItems);
		System.out.println(techItems);
		System.out.println("== GENERIC HASTABLE WILL BE EQUAL TO THE NON-GENERIC ONE AS LONG AS THEIR CONTENT IS EXACT ==");
		System.out.println("techItems.equals(techItems2): "+techItems.equals(techItems2));
		System.out.println("== HASHTABLES  THAT ARE EQUAL WILL HAVE  THE SAME HASHCODE ==");
		System.out.println(techItems.hashCode());
		System.out.println(techItems2.hashCode());
		System.out.println("techItems.hashCode()==techItems2.hashCode(): "+(techItems.hashCode()==techItems2.hashCode()));
		System.out.println("techItems.get(1).hashCode()==techItems.get(1).hashCode(): "+(techItems.get("A").hashCode()==techItems2.get("A").hashCode()));
	}

}
