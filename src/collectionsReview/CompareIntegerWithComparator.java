package collectionsReview;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareIntegerWithComparator {

	public static void main(String[] args) {
		TreeSet numbers=new TreeSet();
		numbers.add(10);
		numbers.add(0);
		numbers.add(25);
		numbers.add(2);
		numbers.add(25);
		numbers.add(35);
		numbers.add(5);
		System.out.println(numbers);
		
//		TreeSet integers=new TreeSet();
		TreeSet integers=new TreeSet(new IntegerCompartor() );
		integers.add(10);
		integers.add(0);
		integers.add(25);
		integers.add(2);
		integers.add(25);
		integers.add(35);
		integers.add(5);
		System.out.println(integers);
	}

}

class IntegerCompartor implements Comparator{
	public int compare(Object o1, Object o2) {
		Integer int1=(Integer)o1;
		Integer int2=(Integer)o2;
		if(int1>int2)
			return -1;
		else if (int1<int2)
			return 1;
		else
			return 0;
	}
}
