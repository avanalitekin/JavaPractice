package LambdaExpression;
import java.util.*;
import java.util.stream.Collectors;

interface Greeting{
	public void perform();
}
class HelloWorldGreeting implements Greeting{
	public void perform() {
		System.out.println("Hello World");
}
}

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
		Greeter greeter=new Greeter();
		greeter.greet(helloWorldGreeting);
		
		
		
	}

}
