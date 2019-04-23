package LambdaExpression;
import java.util.*;
import java.util.stream.Collectors;

interface Greeting3{
	public void perform();
}
//class HelloWorldGreeting3 implements Greeting3{
//	public void perform() {
//		System.out.println("Hello World");
//}
//}

public class Greeter3 {

	public void greet(Greeting3 greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter3 greeter=new Greeter3();
		
	
		Greeting3 lambdaGreeting=()->System.out.println("Hello World!");
		
//		Greeting3 helloWorldGreeting=new HelloWorldGreeting3();
//		
//		greeter.greet(helloWorldGreeting);
//		
//		helloWorldGreeting.perform();
		
		lambdaGreeting.perform();
		
		greeter.greet(lambdaGreeting);
		
		greeter.greet(()->System.out.println("Hello World!"));
		
		
		
	}
	}


