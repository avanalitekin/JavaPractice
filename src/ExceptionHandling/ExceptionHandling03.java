package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {
	FileInputStream players, coach;

	public void myMethod() {
		try {
			players = new FileInputStream("Soccer.txt");
			try {
				coach = new FileInputStream("coach.txt");
				// .. rest of the code
			} catch (FileNotFoundException e) {
				System.out.println("coach.txt not found");//outputs this only if soccer.txt is  available
			}
			// .. rest of the code
		} catch (FileNotFoundException fnfe) {
			System.out.println("players.txt not found");//outputs this only if soccer.txt not  available
		} finally {
			try {
				players.close();
				coach.close();
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ExceptionHandling03 t = new ExceptionHandling03();
		t.myMethod();
	}
}
