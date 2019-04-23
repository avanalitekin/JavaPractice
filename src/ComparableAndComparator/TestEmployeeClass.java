package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeClass {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee("Mark",25));
        employees.add(new Employee("Tom",35));
        employees.add(new Employee("Jack",19));
        employees.add(new Employee("Chris",45));
        employees.add(new Employee("John",24));
        employees.add(new Employee("Mary",20));
        System.out.println("before sorting: "+employees);
        Collections.sort(employees);
        System.out.println("after sorting with comparable interface: "+employees);
        Collections.sort(employees, new SortEmployeeByAge());
        System.out.println("after sorting by age with comparator:  "+employees);
        Collections.sort(employees, new SortEmployeeByName());
        System.out.println("after sorting by name withcomparator:  "+employees);

        System.out.println("after sorting with comparable interface: "+employees);

    }
}
