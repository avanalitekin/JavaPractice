package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;//this code uses Predicate as the functional interface.

class Person3 {
	private String firstName;
	private String lastName;
	private int age;

	public Person3(String firstName, String lastName, int age) {
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
		return "Person3 [firstName= " + firstName + "\t, lastName= " + lastName + "\t, age= " + age + "]";
	}
}

public class Unit1Ex3 {

	public static void main(String[] args) {
		List<Person3> people = Arrays.asList(
				new Person3("Charles", "Dickens", 60), 
				new Person3("Lewis", "Caroll", 42),
				new Person3("Thomas", "Carlyle", 51), 
				new Person3("Charlotte", "Bronte", 45),
				new Person3("Matthew", "Arnold", 39));
		// Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printConditionally(people, p -> true);
		System.out.println();
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		System.out.println();
		printConditionally(people, p -> p.getAge() > 50);
	}

	private static void printConditionally(List<Person3> people, Predicate<Person3> predicate) {
		for (Person3 p : people) {
			if (predicate.test(p))
				System.out.println(p);
		}
	}
}
