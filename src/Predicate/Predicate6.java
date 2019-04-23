package Predicate;
	import java.util.function.Predicate; 
	
	class Predicate6 { 
//		public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
//	        @Override
//	        public boolean test(String t) 
//	        { 
//	            return t.length() > 10; 
//	        } 
//	    }; 
	  
	    public static void predicate_negate() 
	    { 
	    	Predicate<String> hasLengthOf10=s->s.length()>10;//COMMENTED THE SECTION ABOVE ADDED THIS HERE
	        String s = "Thunderstruck is a 2012 children's "
	                                + "film starring Kevin Durant"; 
	  
	        boolean outcome = hasLengthOf10.negate().test(s); 
	        System.out.println(outcome); 
	    } 
	    public static void main(String[] args) 
	    { 
	        predicate_negate(); 
	    } 
	}