package LambdaExpression;

import java.util.*;
//This class does not  use lambdas expressions
interface Validate1 {
	boolean check(Emp1 emp);
}
class Emp1 {
	String name;
	int performanceRating;
	double salary;

	Emp1(String nm, int rating, double sal) {
		name = nm;
		performanceRating = rating;
		salary = sal;
	}
	
	public String getName() {
		return name;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return name + ":" + performanceRating + ":" + salary;
	}
}

class ValidatePerformanceRating1 implements Validate1 {
	public boolean check(Emp1 emp) {
		return (emp.getPerformanceRating() >= 4);
	}
}

class ValidateName1 implements Validate1 {
	public boolean check(Emp1 emp) {
		return (emp.getName().startsWith("P"));
	}
}

class LambdaExpressionMalaG01 {
	public static void main(String args[]) {
		Emp1 e1 = new Emp1("Shreya", 5, 9999.00);
		Emp1 e2 = new Emp1("Paul", 4, 1234.00);
		Emp1 e3 = new Emp1("Harry", 5, 8769.00);
		Emp1 e4 = new Emp1("Pelvan", 4, 2769.00);
		ArrayList<Emp1> empArrList = new ArrayList<>();
		empArrList.add(e1);
		empArrList.add(e2);
		empArrList.add(e3);
		empArrList.add(e4);
		filter(empArrList, new ValidateName1(),new ValidatePerformanceRating1());
	}

	static void filter(ArrayList<Emp1> list, Validate1 rule, Validate1 rule2) {
		for (Emp1 e : list) {
			if (rule.check(e) && rule2.check(e)) {
				System.out.println(e);
			}
		}
	}
}