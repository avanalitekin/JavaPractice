package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling05 {
	
	public static void main(String[] args) {
		try {
			myMethod();
		} catch (StackOverflowError s) {
			System.out.println(s);
		}
	}

	public static void myMethod() {
		System.out.println("myMethod");
		myMethod();
	}
}