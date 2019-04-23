package workout;

import Abstraction.Rectangle;

public class ComparableRectangle extends Rectangle 
implements Comparable<ComparableRectangle> {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
ComparableRectangle[] rectangles= {new ComparableRectangle(3.4, 5.4),
		new ComparableRectangle(13.24, 55.4),
		new ComparableRectangle(7.4, 35.4),
		new ComparableRectangle(1.4, 25.4)};
java.util.Arrays.sort(rectangles);
for(Object rectangle:rectangles) {
	System.out.println(rectangle+" ");
	System.out.println();
	
}
System.out.println();
System.out.println();
System.out.println();
System.out.println();



	
	}
	/** Construct a ComparableRectangle with specified properties */
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}

	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(ComparableRectangle o) {
		if (getArea() > o.getArea()) {
			System.out.println("getArea()+ o.getArea(): "+getArea()+" "+o.getArea());
			
			return 1;
		}
		else if (getArea() < o.getArea()) {
			System.out.println("getArea()+ o.getArea(): "+getArea()+" "+o.getArea());
			
			return -1;
		}
		else {
			System.out.println("getArea()+ o.getArea(): "+getArea()+" "+o.getArea());
		
			return 0;
		}
		
	}

	@Override // Implement the toString method in GeometricObject
	public String toString() {
		return super.toString() + " Area in cr: " + getArea();
	}
}