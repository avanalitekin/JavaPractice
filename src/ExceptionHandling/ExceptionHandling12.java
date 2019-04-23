package ExceptionHandling;

class ExceptionHandling12 {

	void method() {//does not  have a handler to handle StackOverflowError()
		try {
			guru();
			return;//tries to end of execution of Method(),but guru() throw new StackOverflowError();
		} finally {
			System.out.println("finally 1"); //finally executed, no handler for StackOverflowError()
		}                                    //JVM halts the code
	}

	void guru() {
		System.out.println("guru");
		throw new StackOverflowError();
	}

	public static void main(String args[]) {
		ExceptionHandling12 var = new ExceptionHandling12();
		var.method();
	}
}