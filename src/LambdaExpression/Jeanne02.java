package LambdaExpression;

import java.util.*;

interface CheckTrait1 {
	boolean test(Animal1 a);
}

class CheckIfHopper1 implements CheckTrait1 {
	public boolean test(Animal1 a) {
		return a.canHop();
	}
}

class CheckIfSwimmer1 implements CheckTrait1 {
	public boolean test(Animal1 a) {
		return a.canSwim();
	}
}

class Animal1 {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal1(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}

public class Jeanne02 {
	public static void main(String[] args) {
		List<Animal1> animals = new ArrayList<Animal1>(); // list of animals
		animals.add(new Animal1("fish", false, true));
		animals.add(new Animal1("kangaroo", true, false));
		animals.add(new Animal1("rabbit", true, false));
		animals.add(new Animal1("turtle", false, true));
		print(animals, a -> a.canSwim());
		System.out.println();
		print(animals, a -> a.canHop());

		System.out.println();

	}

	private static void print(List<Animal1> animals, CheckTrait1 checker) {
		for (Animal1 animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}