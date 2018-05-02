package Numbers;

import java.text.DecimalFormat;
import java.util.*;

public class Using_HashSet_LinkedHashSet_TreeSet {
	    
	public static void main(String[] args) {
		
			Set<Integer> treeSet = new TreeSet<Integer>();
			Set<Integer> hashSet = new HashSet<Integer>();
			Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
			
			Iterator<Integer> ihs = hashSet.iterator();
			Iterator<Integer> ilhs = linkedHashSet.iterator();
			Iterator<Integer> its = treeSet.iterator();
			
			DecimalFormat format = new DecimalFormat("####0.00");
			
			// HashSet add
	        double start3 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {treeSet.add(i);}
	        double finish3 = System.nanoTime();
	        double vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("HashSet add: " + format.format(vs3) + " ms");
			
		    // LinkedHashSet add
	        double start = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {linkedHashSet.add(i);}
	        double finish = System.nanoTime();
	        double vs1 = (finish - start) / 1_000_000.0;
	        System.out.println("LinkedHashSet add: " + format.format(vs1) +" ms");
	        
	        // TreeSet add
	        double start2 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {treeSet.add(i);}
	        double finish2 = System.nanoTime();
	        double vs2 = (finish2 - start2) / 1_000_000.0;
	        System.out.println("TreeSet add: " + format.format(vs2) + " ms" + "\n");
	        
	        // HashSet iterate all
	        start3 = System.nanoTime();    
	        while (ihs.hasNext()) {int i = (int) ihs.next();}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("HashSet iterate all: " + format.format(vs3) + " ms");
			
		    // LinkedHashSet iterate all
	        start3 = System.nanoTime();    
	        while (ilhs.hasNext()) {int i = (int) ilhs.next();}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("LinkedHashSet iterate all: " + format.format(vs3) + " ms");
	        
	        // TreeSet iterate all
	        start3 = System.nanoTime();    
	        while (its.hasNext()) {int i = (int) its.next();}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("TreeSet iterate all: " + format.format(vs3) + " ms" + "\n");
	        
	        // HashSet remove
	        start3 = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {hashSet.remove(i);}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("HashSet remiove: " + format.format(vs3) + " ms");
			
		    // LinkedHashSet remove
	        start3 = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {linkedHashSet.remove(i);}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("LinkedHashSet remove: " + format.format(vs3) + " ms");
	        
	        // TreeSet remove
	        start3 = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {treeSet.remove(i);}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("TreeSet remove: " + format.format(vs3) + " ms" + "\n");
	        
	}
}
