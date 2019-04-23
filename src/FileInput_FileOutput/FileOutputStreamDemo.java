package FileInput_FileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
//		FileOutputStream fos=new FileOutputStream("WriteToFile.txt", true);
		FileOutputStream fos=new FileOutputStream("WriteToFile.txt");
		
		PrintWriter pw=new  PrintWriter(fos);
		pw.write("This is  what I want to  see on the first line (pw.write)");
		pw.write("\nThis is what I want to see on the second line (pw.write)");
		pw.println("\nThis is what I want to see on the third line (pw.println)");
		pw.close();

	}

}
