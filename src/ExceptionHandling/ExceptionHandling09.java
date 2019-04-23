package ExceptionHandling;


class ExceptionHandling09 {
	public static void main(String[] args) {
		String[][] oldLaptops = { { "Dell", "Toshiba", "Vaio" }, null, { "IBM" }, new String[10] };
		System.out.println(oldLaptops[0][0]); // line 1 outputs "Dell"
		System.out.println(oldLaptops[1]); // line 2 outputs "null", oldLaptops[1][0] will throw nullPointerException
		System.out.println(oldLaptops[3][6]); // line 3// will output "null"
		System.out.println(oldLaptops[3][0].length()); // line 4//nullPointerException
		System.out.println(oldLaptops); // line 5
	}
}
