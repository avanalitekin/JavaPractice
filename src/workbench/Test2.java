package workbench;

import java.io.*;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();
		try {
			java.net.URL url = new java.net.URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			PrintWriter output=new PrintWriter("ReadFromURL2.txt");
			while (input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
				output.println(line);
			}
			System.out.println("The file size is " + count + " characters");
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}