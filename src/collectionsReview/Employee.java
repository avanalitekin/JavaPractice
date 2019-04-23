package collectionsReview;

public class Employee implements Comparable {
		String name;//will be used in comparator class
		int id;//will be used in comparator class
		int age;
		String dept;
		Employee(String name, int age, String dept){
			this.name=name;
			this.age=age;
			this.dept=dept;
			
		}
		Employee(String name, int id){
			this.name=name;
			this.id=id;
		}
		public String toString() {
			return name+" "+id;
		}
		public int compareTo(Object obj) {
			int eid1=this.id;
			Employee e=(Employee)obj;
			int eid2=e.id;
			if(eid1<eid2)
				return -1;
			else if(eid1>eid2)
				return +1;
			else
				return 0;
			
		}
	}