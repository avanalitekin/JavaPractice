package LambdaExpression;
import java.util.*;
import java.util.stream.Collectors;

interface Greeting2{
	public void perform();
}
//class HelloWorldGreeting2 implements Greeting2{
//	public void perform() {
//		System.out.println("Hello World");
//}
//}

public class Greeter2 {

//	public void greet(Greeting2 greeting) {
//		greeting.perform();
//	}
	
	public static void main(String[] args) {
		
		Greeter2 greeter=new Greeter2();
		
	
		Greeting2 lambdaGreeting=()->System.out.println("Hello World!");
		
//		Greeting2 helloWorldGreeting=new HelloWorldGreeting2();
//		
//		greeter.greet(helloWorldGreeting);
//		
//		helloWorldGreeting.perform();
		
		lambdaGreeting.perform();
		
		
	}
	}


