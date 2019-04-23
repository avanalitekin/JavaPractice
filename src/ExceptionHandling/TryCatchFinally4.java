package ExceptionHandling;

public class TryCatchFinally4 {
	String getString() {
		String str = "a";
		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			str=str+"b";
			System.out.println("About to return :" + str);//ab
			return str;
		} finally {
			str=str+"c";
			System.out.println("Return value is now :" + str);//abc
		}
		return str+"d";
	}

	public static void main(String args[]) {
		TryCatchFinally4 var = new TryCatchFinally4();
		System.out.println("In Main01:" + var.getString());//ab
	}
}