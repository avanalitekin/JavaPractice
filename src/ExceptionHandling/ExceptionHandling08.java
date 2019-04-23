package ExceptionHandling;

class Inks {
}

interface Printable {
}

class ColorInks extends Inks implements Printable {
}

class BlackInks extends Inks {
}

class ExceptionHandling08 {
	public static void main(String args[]) {
		Printable printable = null;
		BlackInks blackInk = new BlackInks();
		printable = (Printable) blackInk;//"ClassCastException" --the code that assigns blackInk to printable without an explicit cast will fail to compile.
		
	}
}