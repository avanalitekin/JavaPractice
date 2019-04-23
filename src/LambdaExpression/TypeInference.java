package LambdaExpression;


interface StringLength{
	int getLength(String s);
}
public class TypeInference {

	public static void main(String[] args) {
		StringLength lambdaVar=s->s.length();
		lambdaVar.getLength("Hello Lambda");
		System.out.println(lambdaVar.getLength("Hello Lambda"));
	}
	
}
