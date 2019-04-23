package ExceptionHandling;

public class TryCatchFinally2 {
	int getInt() {
		int returnVal = 5;
		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			System.out.println("About to return :" + returnVal);//5
			return returnVal+= 10;
		} finally {
			returnVal += 2;
			System.out.println("Return value is now :" + returnVal);//17
		}
		return returnVal+4;
	}

	public static void main(String args[]) {
		TryCatchFinally2 var = new TryCatchFinally2();
		System.out.println("In Main01:" + var.getInt());//15
	}
}