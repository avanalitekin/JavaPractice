package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling06 {
	
	public static void main(String[] args) {
		try {
			myMethod();
		} catch (StackOverflowError s) {
			for (int i = 0; i < 2; ++i)
				System.out.println(i);
		}
	}

	public static void myMethod() {
		myMethod();
	}
}