package ExceptionHandling;


	class EJavaBase {
		void myMethod() throws ExceptionInInitializerError {//OKAY-not a checked exception
			System.out.println("Base");
		}
	}

	class EJavaDerived extends EJavaBase {
		void myMethod() throws RuntimeException {//OKAY-not a checked exception
			System.out.println("Derived");
		}
	}

	public class ExceptionHandling13 {
		public static void main(String args[]) {
			EJavaBase obj = new EJavaDerived();
			obj.myMethod();
		}
	}