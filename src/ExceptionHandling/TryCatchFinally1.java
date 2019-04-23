package ExceptionHandling;

public class TryCatchFinally1 {
	int getInt() {
		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			return 10;
		} finally {
			return 20;
		}
	}

	public static void main(String[] args) {
		
		TryCatchFinally1 var = new TryCatchFinally1();
		System.out.println(var.getInt());
	}
}