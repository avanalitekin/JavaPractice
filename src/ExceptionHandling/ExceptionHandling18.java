package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionHandling18 {

	private static final int SIZE = 10;

	public static void main(String[] args) {

		PrintWriter out = null;
		try {
			System.out.println("Entered try statement");

			// PrintWriter, FileWriter
			// are classes in io package
			out = new PrintWriter(new FileWriter("OutFile.txt"));
		} catch (IOException e) {
			// Since the FileWriter in
			// try block can throw IOException
		}

		// Following finally block cleans up
		// and then closes the PrintWriter.

		finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}
}