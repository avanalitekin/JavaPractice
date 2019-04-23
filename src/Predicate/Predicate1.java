package Predicate;
import java.util.ArrayList;
import java.util.function.Predicate; 

public class Predicate1 { 
	public static void main(String[] args) {
		Predicate<Integer> range=i->(i<18 && i>5);
		System.out.println(range.test(6));
		
		
		Predicate<String> startsWith=i->i.startsWith("B");
		System.out.println(startsWith.test("Ali"));
		System.out.println(startsWith.negate().test("Ali"));
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Ali");
		names.add("Adem");
		names.add("Ahmet");
		names.add("Selami");
		System.out.println(names);
		names.removeIf(n->n.charAt(0)!='A');
		System.out.println(names);
		
	}
}