package Numbers;

import java.text.DecimalFormat;

public class Using_long_Long {
	    public static void main(String[] args) {
	    	 
	        final double start = System.nanoTime();
	        long sum = 0L;
	        int max = 1_000_000_000;
	        for (int i = 0; i < max; i++) {sum++;}
	        final double finish = System.nanoTime();
	        final double vs1 = finish - start;
	        System.out.println("Using [long] " + max + " times, Elapsed time: " + vs1 / 1_000_000.0 + " ms");
	  
	        final double start2 = System.nanoTime();
		    Long sum2_1 = 0L;
		    Long sum2; sum2 = (long)sum2_1; 
		    int max2 = 1_000_000_000;
		    for (int i = 0; i < max2; i++) {sum2++;}
		    final double finish2 = System.nanoTime();
		    final double vs2 = finish2 - start2;
		    System.out.println("Using [Long] " + max2 + " times, Elapsed time: " + vs2 / 1_000_000.0 + " ms");
		    
		    Double howMuch = vs2 / vs1;
		    DecimalFormat format = new DecimalFormat("####0.00");
		    System.err.println("long vs Long: long " + format.format(howMuch) + " times faster than Long");
	 }
	}
