package FileInput_FileOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream("WriteToFile.txt");
		Scanner in=new Scanner(fis);
		
		while(in.hasNext()) {
			System.out.print(in.next());
		}

	}

}
