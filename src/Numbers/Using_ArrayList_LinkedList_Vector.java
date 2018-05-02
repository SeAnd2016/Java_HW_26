package Numbers;

import java.text.DecimalFormat;
import java.util.*;

public class Using_ArrayList_LinkedList_Vector {
	    
	public static void main(String[] args) {
		
			List<Integer> arrayList = new ArrayList<Integer>();
			List<Integer> linkedList = new LinkedList<Integer>();
			List<Integer> vector = new Vector<Integer>();
			
			DecimalFormat format = new DecimalFormat("####0.00");
			
			// Vector add
	        double start3 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {vector.add(i);}
	        double finish3 = System.nanoTime();
	        double vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("Vector add: " + format.format(vs3) + " ms");
			
		    // ArrayList add
	        double start = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {arrayList.add(i);}
	        double finish = System.nanoTime();
	        double vs1 = (finish - start) / 1_000_000.0;
	        System.out.println("ArrayList add: " + format.format(vs1) +" ms");
	        
	        // LinkedList add
	        double start2 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {linkedList.add(i);}
	        double finish2 = System.nanoTime();
	        double vs2 = (finish2 - start2) / 1_000_000.0;
	        System.out.println("LinkedList add: " + format.format(vs2) + " ms" + "\n");
	        
	        // Vector get
	        start3 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {vector.get(i);}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("Vector get: " + format.format(vs3) + " ms");
	        
	        // ArrayList get
	        start = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {arrayList.get(i);}
	        finish = System.nanoTime();
	        vs1 = (finish - start) / 1_000_000.0;
	        System.out.println("ArrayList get: " + format.format(vs1) + " ms");
	        
	        // LinkedList get
	        start2 = System.nanoTime();    
	        for (int i = 0; i < 100_000; i++) {linkedList.get(i);}
	        finish2 = System.nanoTime();
	        vs2 = (finish2 - start2) / 1_000_000.0;
	        System.out.println("LinkedList get: " + format.format(vs2) + " ms" + "\n");
	        
	        // Vector remove
	        start3 = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {vector.remove(i);}
	        finish3 = System.nanoTime();
	        vs3 = (finish3 - start3) / 1_000_000.0;
	        System.out.println("Vector remove: " + format.format(vs3) + " ms");
	        
	        // ArrayList remove
	        start = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {arrayList.remove(i);}
	        finish = System.nanoTime();
	        vs1 = (finish - start) / 1_000_000.0;
	        System.out.println("ArrayList remove: " + format.format(vs1) + " ms");
	        
	        // LinkedList remove
	        start2 = System.nanoTime();    
	        for (int i = 99999; i >= 0; i--) {linkedList.remove(i);}
	        finish2 = System.nanoTime();
	        vs2 = (finish2 - start2) / 1_000_000.0;
	        System.out.println("LinkedList remove: " + format.format(vs2) + " ms");
	        
	}
}
