package collectionsReview;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
	System.out.println("============= DEFAULT NATRUAL  SORTING ORDER WITH COMPARE METHOD FROM COMPARATOR INTERFACE =============");
	TreeSet numbers=new TreeSet();
	numbers.add(10);
	numbers.add(1);
	numbers.add(0);
	numbers.add(9);
	numbers.add(5);
	System.out.println(numbers);
	System.out.println("============= CUSTOMIZED  SORTING ORDER WITH COMPARE METHOD FROM MYCOMPARATOR1 CLASS =============");
	TreeSet numbers2=new TreeSet(new MyComparator1());
	numbers2.add(10);
	numbers2.add(1);
	numbers2.add(0);
	numbers2.add(9);
	numbers2.add(5);
	System.out.println(numbers2);
	
	System.out.println("============= CUSTOMIZED  SORTING ORDER WITH COMPARE METHOD FROM MYCOMPARATOR2 CLASS =============");
	TreeSet numbers3=new TreeSet(new MyComparator2());
	numbers3.add(10);
	numbers3.add(1);
	numbers3.add(0);
	numbers3.add(9);
	numbers3.add(5);
	System.out.println(numbers3);

	
	System.out.println("============= CUSTOMIZED  SORTING ORDER OF SB OBJECTS WITH COMPARE METHOD FROM MYCOMPARATOR2 CLASS =============");
	TreeSet numbers4=new TreeSet(new MyComparator3());
	numbers4.add(new StringBuilder("A"));
	numbers4.add(new StringBuilder("Z"));
	numbers4.add(new StringBuilder("B"));
	numbers4.add(new StringBuilder("Y"));
	numbers4.add(new StringBuilder("K"));
	System.out.println(numbers4);
	
	System.out.println("============= CUSTOMIZED  SORTING ORDER IN INCREASING LENGTH ORDER WITH COMPARE METHOD FROM MYCOMPARATOR2 CLASS =============");
	TreeSet numbers5=new TreeSet(new MyComparator4());
	numbers5.add("A");
	numbers5.add(new StringBuilder("ZAA"));
	numbers5.add("bb");
	numbers5.add(new StringBuilder("AAZ"));
	numbers5.add(new StringBuilder("K"));
	System.out.println(numbers5);

	}
}
class MyComparator1 implements  Comparator{
	public int compare(Object o1, Object o2) {
		if((Integer)o1>(Integer)o2)
			return -1;
		else if ((Integer)o1<(Integer)o2)
			return +1;
		else
			return 0;
	}
}
	class MyComparator2 implements  Comparator{
		public int compare(Object o1, Object o2) {
			return -((Integer) o1).compareTo((Integer)o2);//by changing the sign you can change the sorting order
		}
	}
	
	
	class MyComparator3 implements Comparator{
		public int compare(Object o1, Object o2) {
			return -((String)o1.toString()).compareTo(((String)o2.toString()));
	}
	}
		
		class MyComparator4 implements Comparator{
			public int compare(Object o1, Object o2) {
				String s1=o1.toString();
				String s2=o2.toString();
				if (s1.length()<s2.length())
					return -1;
				else if(s1.length()>s2.length())
					return +1;
				else
				return s1.compareTo(s2);
		}
}
	
