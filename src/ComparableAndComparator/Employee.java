package ComparableAndComparator;

import java.util.Comparator;

public class Employee implements Comparable <Employee> {
    String name;
    int age;
    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return name+": "+age;
    }
//    public int compareTo(Employee o){
//        return this.name.compareTo(o.getName());
//    }

    public int compareTo(Employee o){
        Integer thisAge=this.age;
        Integer employeeAge=o.getAge();
        return thisAge.compareTo(o.getAge());
    }
}
class SortEmployeeByAge implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        if (o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }
}
class SortEmployeeByName implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2){

        return o1.getName().compareTo(o2.getName());
    }
}


