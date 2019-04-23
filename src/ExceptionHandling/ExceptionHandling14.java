package ExceptionHandling;

public class ExceptionHandling14 {

	void foo() {
		try {
			String s = null;
			System.out.println("1");
			try {
				System.out.println(s.length());
			} catch (NullPointerException e) {
				System.out.println("inner");
			}
			System.out.println("2");
		} catch (NullPointerException e) {
			System.out.println("outer");
		}
	}

	public static void main(String args[]) {
		ExceptionHandling14 obj = new ExceptionHandling14();
		obj.foo();
	}
}
