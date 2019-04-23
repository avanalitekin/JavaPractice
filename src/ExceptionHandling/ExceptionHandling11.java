package ExceptionHandling;

	class Course {
		String courseName;

		Course() {
			Course c = new Course();//StackOverflowError recursive call of the  constructor
			c.courseName = "Oracle";
		}
	}

	class ExceptionHandling11 {
		public static void main(String args[]) {
			Course c = new Course();
			c.courseName = "Java";
			System.out.println(c.courseName);
		}
	}