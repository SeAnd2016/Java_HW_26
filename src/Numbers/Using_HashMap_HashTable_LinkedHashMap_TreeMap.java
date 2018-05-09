package Numbers;

import java.text.DecimalFormat;
import java.util.*;

public class Using_HashMap_HashTable_LinkedHashMap_TreeMap {
	    
	public static void main(String[] args) {
		
			Map<Integer, String> hashMap = new HashMap<>();
			Map<Integer, String> hashTable = new Hashtable<>();
			Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
			Map<Integer, String> treeMap = new TreeMap<>();
			
			DecimalFormat format = new DecimalFormat("####0.00");
			
			// HashMap put
	        double start3 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashMap.put(i, "abc");}
	        double finish3 = System.nanoTime();
	        double vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("HashMap put: " + format.format(vs3) + " ms");
			
		    // Hashtable put
	        double start = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashTable.put(i, "abc");}
	        double finish = System.nanoTime();
	        double vs1 = (finish - start) / 1_000_000.0;
	        System.out.println("Hashtable put: " + format.format(vs1) +" ms");
	        
	        // LinkedHashMap put
	        double start2 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {linkedHashMap.put(i, "abc");}
	        double finish2 = System.nanoTime();
	        double vs2 = (finish2 - start2) / 1_000_000.0;
	        System.out.println("LinkedHashMap put: " + format.format(vs2) + " ms");
	        
	        // TreeMap put
	        double start4 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {treeMap.put(i, "abc");}
	        double finish4 = System.nanoTime();
	        double vs4 = (finish4 - start4) / 1_000_000.0;
	        System.out.println("TreeMap put: " + format.format(vs4) + " ms" + "\n");
	        
	        // HashMap get
	        double start32 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashMap.get(i);}
	        double finish32 = System.nanoTime();
	        double vs32 = (finish32 - start32) / 1_000_000.0;
	        System.out.println("HashMap get: " + format.format(vs32) + " ms");
			
		    // Hashtable get
	        double start12 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashTable.get(i);}
	        double finish12 = System.nanoTime();
	        double vs12 = (finish12 - start12) / 1_000_000.0;
	        System.out.println("Hashtable get: " + format.format(vs12) +" ms");
	        
	        // LinkedHashMap get
	        double start22 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {linkedHashMap.get(i);}
	        double finish22 = System.nanoTime();
	        double vs22 = (finish22 - start22) / 1_000_000.0;
	        System.out.println("LinkedHashMap get: " + format.format(vs22) + " ms");
	        
	        // TreeMap get
	        double start42 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {treeMap.get(i);}
	        double finish42 = System.nanoTime();
	        double vs42 = (finish42 - start42) / 1_000_000.0;
	        System.out.println("TreeMap get: " + format.format(vs42) + " ms" + "\n");
	        
	        // HashMap remove
	        double start321 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashMap.remove(i);}
	        double finish321 = System.nanoTime();
	        double vs321 = (finish321 - start321) / 1_000_000.0;
	        System.out.println("HashMap remove: " + format.format(vs321) + " ms");
			
		    // Hashtable remove
	        double start121 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {hashTable.remove(i);}
	        double finish121 = System.nanoTime();
	        double vs121 = (finish121 - start121) / 1_000_000.0;
	        System.out.println("Hashtable remove: " + format.format(vs121) +" ms");
	        
	        // LinkedHashMap remove
	        double start221 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {linkedHashMap.remove(i);}
	        double finish221 = System.nanoTime();
	        double vs221 = (finish221 - start221) / 1_000_000.0;
	        System.out.println("LinkedHashMap remove: " + format.format(vs221) + " ms");
	        
	        // TreeMap remove
	        double start421 = System.nanoTime();    
	        for (int i = 0; i < 1000_000; i++) {treeMap.remove(i);}
	        double finish421 = System.nanoTime();
	        double vs421 = (finish421 - start421) / 1_000_000.0;
	        System.out.println("TreeMap remove: " + format.format(vs421) + " ms");
	        
	}
}
