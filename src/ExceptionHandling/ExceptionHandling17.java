package ExceptionHandling;

public class ExceptionHandling17 {

	static void A() {
		try {
			System.out.println("inside B");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("B's finally");
		}
	}

	// This method also calls finally. This method
	// will be called outside try-catch.
	static void B() {
		try {
			System.out.println("inside B");
			return;
		} finally {
			System.out.println("B's finally");
		}
	}

	public static void main(String args[]) {
		try {
			A();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		B();
	}
}