package Predicate;

import java.util.function.Predicate; 
	public class Predicate2 { 
		public static void main(String[] args) {
			Predicate<Integer> between10And20=n->(n>10 && n<20);
			
			System.out.println(between10And20.test(11));
			System.out.println(between10And20.negate().test(9));
		}
	}