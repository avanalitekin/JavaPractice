package collectionsReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashMap is a class implements MAP interface
		//HashMap extends AbstractMap
		//HashMap contains only unique elements
		//store the values-key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//HashMap is non-synchronized --not tread safe  //multiple access is allowed to an object
		//concurrent modification exception --fail-fast condition
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "selenium");
		hm.put(2, "QTP");
		hm.put(3, "Java");
		hm.put(4, "TestNG");
		hm.put(4, "Ali");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));
		System.out.println(hm.get(4));
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Tom", 25, "Admin");
		Employee e2=new Employee("Peter", 26, "QA");
		Employee e3=new Employee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		for (Entry<Integer, Employee> m: emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("Employee "+key+" Info");
			System.out.println(e.name+ " || "+e.age+" || "+e.dept);
		}
	}

}
