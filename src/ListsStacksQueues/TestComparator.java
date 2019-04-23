package ListsStacksQueues;

import Abstraction.Rectangle;
import java.util.Comparator;
import Abstraction.Circle;
import Abstraction.GeometricObject;

public class TestComparator {
	public static void main(String[] args) {
		GeometricObject g1 = new Rectangle(5, 5);
		GeometricObject g2 = new Circle(5);
		GeometricObject g = max(g1, g2, new GeometricObjectComparator());

		System.out.println(" The area of  larger  object is " + g.getArea());

	}

	public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
		if (c.compare(g1, g2) > 0)
			return g1;
		else
			return g2;
	}

}

class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {

	public int compare(GeometricObject o1, GeometricObject o2) {
		double area1 = o1.getArea();
		double area2 = o2.getArea();
		if (area1 < area2)
			return -1;
		else if (area2 > area1)
			return 1;
		else
			return 0;

	}

}
