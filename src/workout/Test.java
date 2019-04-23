package workout;

class Test { 
    public static void main(String[] args) 
    { 
       String str="a23";
       try {
       System.out.println(Integer.parseInt(str));
       }catch (NumberFormatException nfe) {
    	   for(int i=0; i<str.length();i++) {
    	   if(Character.isDigit(str.charAt(i))){
    		   System.out.println(Integer.parseInt(str.substring(i)));
    	   }
    		   }
    	   }
        
    } 
} 