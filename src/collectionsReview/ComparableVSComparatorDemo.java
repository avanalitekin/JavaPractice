package collectionsReview;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableVSComparatorDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee("John", 100);
		Employee e2=new Employee("Tom", 500);
		Employee e3=new Employee("Mark", 200);
		Employee e4=new Employee("Tim", 400);
		Employee e5=new Employee("John", 550);
		TreeSet<Employee> employees=new TreeSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
System.out.println("======== SORT EMPLOYEES BY ID USING COMPARETO() METHOD =========");	
		System.out.println(employees);
		
		TreeSet<Employee> employees2=new TreeSet<Employee>(new MyComparatorClass());
		employees2.add(e1);
		employees2.add(e2);
		employees2.add(e3);
		employees2.add(e4);
		employees2.add(e5);
System.out.println("======== SORT EMPLOYEES BY NAME USING COMPARE() METHOD =========");	
System.out.println(employees2);
	}
	}
	class MyComparatorClass implements Comparator{
		
		public int compare(Object  o1, Object o2) {
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
			String s1=e1.name;
			String s2=e2.name;
			return -s1.compareTo(s2);
		}
		
	}
