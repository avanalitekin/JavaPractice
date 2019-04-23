package Predicate;

import java.util.function.Predicate;
import java.util.Objects;

class Predicate5 {
//	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
//		@Override
//		public boolean test(String t) {
//			return t.length() > 10;
//		}
//	};

	public static void predicate_and() {
		Predicate<String> nonNullPredicate = Objects::nonNull;
		Predicate<String> hasLengthOf10=s->s.length()>10;//COMMENTED THE SECTION ABOVE ADDED THIS HERE
		String s1 = null;

		boolean outcome = nonNullPredicate.and(hasLengthOf10).test(s1);
		System.out.println(outcome);

		String s2 = "Welcome to the machine";
		boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(s2);
		System.out.println(outcome2);
	}

	public static void main(String[] args) {
		predicate_and();
	}
}