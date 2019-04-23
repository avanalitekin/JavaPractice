package ExceptionHandling;

public class ExceptionHandling15 {

	public void go() {
		System.out.print("B");
		try {
			stop();
		} catch (ArithmeticException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public void stop() {
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F");
	}

	public static void main(String[] args) {
		new ExceptionHandling15().go();
	}
}