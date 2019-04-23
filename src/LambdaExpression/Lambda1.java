package LambdaExpression;

interface FuntionalInterFace{
	void abstractFun(int x);
	default void  normalFun() {
		System.out.println("Hello");
	}
}

public class Lambda1 {

	public static void main(String[] args) {

		FuntionalInterFace fobj=(e)->System.out.println(2*e);
		
		fobj.abstractFun(5);
	}

}
