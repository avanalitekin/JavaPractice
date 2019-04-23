package workout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class Main {

	public static void main(String[] args) {
		String[] strArr={"a", "b", "a", "c", "a", "d", "a"};
		System.out.println(wordAppend(strArr));
	}

	public static String wordAppend(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  String result="";
		  for(String str:strings){
		    if(!map.containsKey(str)){
		      map.put(str,1);
		    }
		    else {
		      if(map.get(str)%2==1){
		        result+=str;
		        map.put(str,map.get(str)+1);
		      }
		      else {
		    	  map.put(str,map.get(str)+1);
		      }
		    }
		  }
		  return result;
		}

}
