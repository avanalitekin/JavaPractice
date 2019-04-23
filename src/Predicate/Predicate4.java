package Predicate;

	import java.util.function.Predicate; 
	class Predicate4 { 
//		 public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
//		        @Override
//		        public boolean test(String s) 
//		        { 
//		            return s.length() > 10; 
//		        } 
//		    };
		  
		    public static void predicate_or() 
		    { 
		    	Predicate<String> hasLengthOf10=s->s.length()>10; //COMMENTED THE SECTION ABOVE ADDED THIS HERE
		        Predicate<String> containsLetterA = p -> p.contains("B"); 
		        String s = "EndOfThA"; 
		        boolean outcome = hasLengthOf10.and(containsLetterA).test(s); 
		        System.out.println(outcome); 
		    } 
		    public static void main(String[] args) 
		    { 
		        predicate_or(); 
		    } 
		} 