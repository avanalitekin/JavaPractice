package ExceptionHandling;

public class TryCatchFinally3 {
	StringBuilder getStringBuilder() {
		StringBuilder returnVal = new StringBuilder("10");
		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			System.out.println("About to return :" + returnVal);//10
			return returnVal.append("5");
		} finally {
			returnVal.append("10");
			System.out.println("Return value is now :" + returnVal);//10510
		}
		return returnVal;
	}

	public static void main(String args[]) {
		TryCatchFinally3 var = new TryCatchFinally3();
		System.out.println("In Main01:" + var.getStringBuilder());//10510
	}
}