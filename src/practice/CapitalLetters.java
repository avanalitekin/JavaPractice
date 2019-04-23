package practice;

public class CapitalLetters {

	public static void main(String[] args) {
	String country="UnITed1 2sTatEs oF aMerICA3";
	String capitalLetters="";
	String lowerCaseLetters="";
	String digits="";
	int spaceCount=0;
	for (int i=0; i<country.length();i++) {
		if(Character.isUpperCase(country.charAt(i))) {
			capitalLetters+=(country.charAt(i));
		}
		if(Character.isLowerCase(country.charAt(i))) {
			capitalLetters=capitalLetters+(country.charAt(i));
			lowerCaseLetters+=country.charAt(i);
		}
		if(Character.isDigit(country.charAt(i))) {
			capitalLetters=capitalLetters+(country.charAt(i));
			digits+=country.charAt(i);
		}
		if(Character.isWhitespace(country.charAt(i))) {
			spaceCount++;
		}
		
	}
	System.out.println("capitalLetters: "+capitalLetters);
	System.out.println("lowerCaseLetters: "+lowerCaseLetters);
	System.out.println("digits: "+digits);
	System.out.println("space counts: "+spaceCount);
	}

}
