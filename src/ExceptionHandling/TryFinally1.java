package ExceptionHandling;

public class TryFinally1 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println("Try block : open resource 1");
			System.out.println("Try block : open resource 2");
			System.out.println("in try : " + name.length());
			System.out.println("Try block : close resources");
		} finally {
			System.out.println("finally : close resources");
		}
	}
}