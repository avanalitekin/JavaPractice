package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Condition {
	boolean test(Person2 p);
}

class Person2 {
	private String firstName;
	private String lastName;
	private int age;

	public Person2(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setFirstName(String fname) {
		firstName = fname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lname) {
		lastName = lname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Person2 [firstName= " + firstName + "\t, lastName= " + lastName + "\t, age= " + age + "]";
	}
}

public class Unit1Ex2 {

	public static void main(String[] args) {
		List<Person2> people = Arrays.asList(
				new Person2("Charles", "Dickens", 60), 
				new Person2("Lewis", "Caroll", 42),
				new Person2("Thomas", "Carlyle", 51), 
				new Person2("Charlotte", "Bronte", 45),
				new Person2("Matthew", "Arnold", 39));
		// Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printConditionally(people, p -> true);
		System.out.println();
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		System.out.println();
		printConditionally(people, p -> p.getAge() > 50);
	}

	private static void printConditionally(List<Person2> people, Condition condition) {
		for (Person2 p : people) {
			if (condition.test(p))
				System.out.println(p);
		}
	}
}
