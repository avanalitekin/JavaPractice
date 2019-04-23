package collectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionCybertek07 {
	public static void main(String[] args) {
        List< Map<String,String>  > excelSheet = new ArrayList<>();
        
        Map<String,String> cellMap1 = new HashMap<>();
                           cellMap1.put("A", "Adam"); 
                           cellMap1.put("B", "25"); 
                           cellMap1.put("C", "Male");
        
                           excelSheet.add(cellMap1) ; 
                           
        Map<String,String> cellMap2 = new HashMap<>();
                           cellMap2.put("A", "JOHN"); 
                           cellMap2.put("B", "27"); 
                           cellMap2.put("C", "Male");
        
                           excelSheet.add(cellMap2) ; 
                           
        Map<String,String> cellMap3 = new HashMap<>();
                           cellMap3.put("A", "MARY"); 
                           cellMap3.put("B", "22"); 
                           cellMap3.put("C", "Female");
        
                           excelSheet.add(cellMap3) ; 
                           
        System.out.println( excelSheet );
        
        System.out.println( excelSheet.get(2).get("A") );
	}
}