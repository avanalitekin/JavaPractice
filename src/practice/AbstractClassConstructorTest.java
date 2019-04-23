package practice;

abstract class AbstractClassConstructor { 
    int multiplyBy;
    public int age=5;
    public AbstractClassConstructor( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
        
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }

	@Override
	public String toString() {
		return "AbstractClassConstructor [multiplyBy=" + multiplyBy + "]";
	}
    
}

class TimesTwo extends AbstractClassConstructor {
    public TimesTwo() {
        super(2);
        
    }
}

class TimesWhat extends AbstractClassConstructor {
    public TimesWhat(int what) {
        super(what);
    }
}
public class AbstractClassConstructorTest{
	public static void main(String[] args) {
		System.out.println(new TimesTwo().toString());
		System.out.println(new TimesWhat(5).toString());
		AbstractClassConstructor ac=new TimesTwo();
		System.out.println(ac.age);
		
	}
}