package Predicate;

	import java.util.function.Predicate; 
	class Predicate3 { 
		static void pred(int num, Predicate<Integer> predicate) {
			if(predicate.test(num)) {
				System.out.println(num+" meets the criteria as a number");
			}else {
				System.out.println(num+" does not meet the criteria as a number");
			}
		}
		static void predNegate(int num, Predicate<Integer> predicate) {
			if(predicate.negate().test(num)) {
				System.out.println(num+" NEGATE() meets the criteria as a number");
			}else {
				System.out.println(num+" NEGATE() does not meet the criteria as a number");
			}
		}
		public static void  main(String[] args) {
			pred(10,n-> n>99);
			predNegate(15,n-> n>99);
		}
	}