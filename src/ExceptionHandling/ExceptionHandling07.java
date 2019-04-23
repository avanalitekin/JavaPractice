package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExceptionHandling07 {
	
	public static void main(String[] args) {
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		inks.add(new BlackInk());
		Ink ink = (BlackInk)inks.get(0);//ClassCastException for index=0, no exception will be thrown for index=1;
			}
}

class Ink {
}

class ColorInk extends Ink {
}

class BlackInk extends Ink {
}