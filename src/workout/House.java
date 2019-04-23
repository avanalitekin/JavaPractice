package workout;

public class House implements Cloneable, Comparable<House>{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	public House(int id, double area) {
		this.id=id;
		this.area=area;
		whenBuilt=new java.util.Date();
	}
	public int getId() {
		return id;
	}
	public double getArea()
	{
		return area;
	}
	public java.util.Date getWhenBuilt(){
		return whenBuilt;
	}
	public int compareTo(House h) {
		if (id>h.id)
			return 1;
		else if(id<h.id)
			return -1;
		else 
			return 0;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public void cloning() throws CloneNotSupportedException{
	House house1=new House(1,2831.00);
	House house2=(House)house1.clone();
	}
}
