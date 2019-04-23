package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling01{

	FileInputStream soccer;
	public void myMethod() throws FileNotFoundException {//this declares trow fnfe on line 13.
		try {
		soccer = new FileInputStream("soccer.txt");
		} catch (FileNotFoundException f) {//checked exception handled here
//			f.printStackTrace();
		System.out.println("file not found");//throw fnfe;  //this needs to be handled or declared
		}
		}

	public static void main(String[] args) throws Exception {
		ExceptionHandling01 t=new ExceptionHandling01();
		t.myMethod();
		}
	}
