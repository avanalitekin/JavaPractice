package ListsStacksQueues;


import java.util.*;
public class TestCollection {
public static void main(String[] args) {
ArrayList<String> collection1 = new ArrayList<>();
collection1.add("New York");
collection1.add("Atlanta");
collection1.add("Dallas");
collection1.add("Madison");
System.out.println("===== A list of cities in collection1: =====");
System.out.println(collection1);
collection1.remove("Dallas");
System.out.println("===== after collection1.remove(\"Dallas\");=====");
System.out.println(collection1);
collection1.add("Austin");
System.out.println("===== after collection1.add(\"Austin\")=====");
System.out.println(collection1);
collection1.remove(1);
System.out.println("===== after collection1.remove(1);=====");
System.out.println(collection1);

ArrayList<String> collection2=new ArrayList<String>();
collection2.add("Seattle");
collection2.add("Portland");
collection2.add("Los Angeles");
collection2.add("Madison");
collection2.add("New York");
System.out.println("==============collection 2==============");
System.out.println(collection2);

ArrayList<String> c1=(ArrayList<String>)collection1.clone();
System.out.println("===c1 after ArrayList<String> c1=(ArrayList<String>)collection1.clone();===");
System.out.println(c1);
c1.addAll(collection2);
System.out.println("===c1 after c1.addAll(collection2);===");
System.out.println(c1);
c1.retainAll(collection2);
System.out.println("===c1 after c1.retainAll(collection2);===");
System.out.println(c1);
System.out.println("===c2 to compare with collection2);===");
System.out.println(collection2);

c1=(ArrayList<String>)collection1.clone();
System.out.println("=======c1 after c1=(ArrayList<String>)collection1.clone(); =======");
System.out.println(c1);
System.out.println("collection1 to compare with  c1");
System.out.println(collection1);

c1=new ArrayList<String>(collection2);
System.out.println("====== c1 after c1=new ArrayList(collection2); ======");
System.out.println(c1);
System.out.println("====== collection 2 to compare with c1 ======");
System.out.println(collection2);
System.out.println(c1.contains("Madison"));
System.out.println(c1.containsAll(collection2));
c1.addAll(collection1);
System.out.println(c1.containsAll(collection1));

	}

}
