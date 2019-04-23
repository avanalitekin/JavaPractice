package LambdaExpression;

public class Lambda3 {
	interface FunctionalInt1{
		int operation(int a,int b);
	}
	interface FuntionalInt2{
		void sayMessage(String message);
	}
	private int operate(int a, int b, FunctionalInt1 fobj) {
		return fobj.operation(a,b);
	}
	
	public static void main(String[] args) {
		FunctionalInt1 add=(x,y)->x+y;
		FunctionalInt1 multiply=(x,y)->x*y;
		Lambda3 classobj=new Lambda3();
		System.out.println("Addition is "+add.operation(6, 3));
		System.out.println("Multiplication is "+multiply.operation(6, 3));
		System.out.println("Addition is "+classobj.operate(6,3,add));
		System.out.println("Multiplication is "+classobj.operate(6, 3, multiply));
		FuntionalInt2 fobj=message->System.out.println("Hello "+message);
		fobj.sayMessage("Ali");
		
	}

}
