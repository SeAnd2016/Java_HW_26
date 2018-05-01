package Numbers;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class Using_Integer_AtomicInteger {
	    public static void main(String[] args) {
	    	 
	        final double start = System.nanoTime();
	        Integer sum = 0;
	        int max = 1_000_000_000;
	        for (int i = 0; i < max; i++) {sum++;}
	        final double finish = System.nanoTime();
	        final double vs1 = finish - start;
	        System.out.println("Using [Integer] " + max + " times, Elapsed time: " + vs1 / 1_000_000.0 + " ms");
	  
	        final double start2 = System.nanoTime();
		    AtomicInteger sum2 = new AtomicInteger();
		    int max2 = 1_000_000_000;
		    for (int i = 0; i < max2; i++) {sum2.incrementAndGet();}
		    final double finish2 = System.nanoTime();
		    final double vs2 = finish2 - start2;
		    System.out.println("Using [AtomicInteger] " + max2 + " times, Elapsed time: " + vs2 / 1_000_000.0 + " ms");
		    
		    Double howMuch = vs2 / vs1;
		    DecimalFormat format = new DecimalFormat("####0.00");
		    System.err.println("Integer vs AtomicInteger: Integer " + format.format(howMuch) + " times faster than AtomicInteger");
	 }
	}
