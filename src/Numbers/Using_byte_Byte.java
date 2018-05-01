package Numbers;

import java.text.DecimalFormat;

public class Using_byte_Byte {
	    public static void main(String[] args) {
	    	 
	        final double start = System.nanoTime();
	        byte sum = 0;
	        int max = 1_000_000_000;
	        for (int i = 0; i < max; i++) {sum++;}
	        final double finish = System.nanoTime();
	        final double vs1 = finish - start;
	        System.out.println("Using [byte] " + max + " times, Elapsed time: " + vs1 / 1_000_000.0 + " ms");
	  
	        final double start2 = System.nanoTime();
		    Byte sum2 = 0;
		    int max2 = 1_000_000_000;
		    for (int i = 0; i < max2; i++) {sum2++;}
		    final double finish2 = System.nanoTime();
		    final double vs2 = finish2 - start2;
		    System.out.println("Using [Byte] " + max2 + " times, Elapsed time: " + vs2 / 1_000_000.0 + " ms");
		    
		    Double howMuch = vs2 / vs1;
		    DecimalFormat format = new DecimalFormat("####0.00");
		    System.err.println("byte vs Byte: byte " + format.format(howMuch) + " times faster than Byte");
	 }
	}
