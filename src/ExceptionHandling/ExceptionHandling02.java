package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling02 {

	public void myMethod() throws IOException {
		FileInputStream soccer = new FileInputStream("soccer.txt");
		soccer.close();
	}

	public static void main(String[] args) throws IOException {
		ExceptionHandling02 t = new ExceptionHandling02();
		t.myMethod();
	}
}
