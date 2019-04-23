package collectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Paul", 25,"Player");
		Employee e2=new Employee("George", 26, "Defense");
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Ali", 25, "Admin"));
		employees.add(new Employee("Veli", 30, "HR"));
		employees.add(new Employee("Selami", 45, "Sales"));
		employees.add(e1);
		employees.add(e2);
		
		Iterator<Employee> it=employees.iterator();
		System.out.println("===================== ITERATOR EXAMPLE =====================");
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println("Name: "+emp.name+"\tAge: "+emp.age+"\tDepartment: "+emp.dept);
		}
		System.out.println("===================== addAll() EXAMPLE =====================");
		ArrayList<String> friends=new ArrayList<>();
		friends.add("Mehmet");
		friends.add("ibrahim");
		friends.add("ridvan");
		friends.add("yasar");
		
		System.out.println("===================== creating an equivalentElement =====================");
		ArrayList<String> copyFriends=new ArrayList<String>(friends);
		System.out.println("friends: "+friends);
		System.out.println("copyFriends: "+copyFriends);
		
		ArrayList<String> family=new ArrayList<>();
		family.add("Ali");
		family.add("Mary");
		family.add("Dilo");
		family.add("Mehmet");
		
		ArrayList<String> familyFriends=new ArrayList<>();
		//addAll()
		System.out.println("Before any addition familyFriens: \n"+familyFriends);
		familyFriends.addAll(family);
		System.out.println("family added list: \n"+familyFriends);
		familyFriends.addAll(friends);
		System.out.println("family and  friends added list: \n"+familyFriends);
		familyFriends.addAll(family);
		System.out.println("family,  friends and family again added list: \n"+familyFriends);
		//removeAll();
		System.out.println("===================== removeAll() EXAMPLE =====================");
		familyFriends.removeAll(family);
		System.out.println("Family removed from familyFriend: \n"+familyFriends);
		familyFriends.removeAll(friends);
		System.out.println("Family and friends removed from familyFriends: \n"+familyFriends);
		//retainAll()
		System.out.println("===================== retainAll() EXAMPLE =====================");
		familyFriends.addAll(friends);
		System.out.println("family on the list: \n"+familyFriends);
		familyFriends.addAll(family);
		System.out.println("family and friends on the list: \n"+familyFriends);
		familyFriends.retainAll(family);
		System.out.println("retainAll(family)==========: \n"+familyFriends);
		familyFriends.retainAll(friends);
		System.out.println("retainAll(friends)==========: \n"+familyFriends);

	}
	}



