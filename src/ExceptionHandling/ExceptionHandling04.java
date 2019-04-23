package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling04 {
	
	static FileInputStream players, coach;

	public static void main(String[] args) throws IOException {
		try {
			players = new FileInputStream("Ali.txt");
			System.out.println("players.txt found");
			try {
				coach.close();
			} catch (IOException e) {
				System.out.println("coach.txt not found");
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("players.txt not found");
		} catch (NullPointerException ne) {
			System.out.println("NullPointerException");
		}
	}
}
