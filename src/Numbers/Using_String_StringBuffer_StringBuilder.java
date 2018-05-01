package Numbers;

import java.text.DecimalFormat;

public class Using_String_StringBuffer_StringBuilder {
	    
	public static void main(String[] args) {
	    	    
		    // Using String
	        final double start = System.nanoTime();
	        String s = "a";     
	        int max = 1_000_000;
	        for (int i = 0; i < max; i++) {s = s.concat("b");}
	        final double finish = System.nanoTime();
	        final double vs1 = finish - start;
	        System.out.println("Using [String] " + max + " times, Elapsed time: " + vs1 / 1_000_000.0 + " ms");
	        
	        // Using StringBuffer
	        final double start2 = System.nanoTime();
		    StringBuffer sb = new StringBuffer("a");
		    int max2 = 1_000_000;
		    for (int i = 0; i < max2; i++) {sb = sb.append("b");}
		    final double finish2 = System.nanoTime();
		    final double vs2 = finish2 - start2;
		    System.out.println("Using [StringBuffer] " + max2 + " times, Elapsed time: " + vs2 / 1_000_000.0 + " ms");
		    
		    // Using StringBuilder
	        final double start3 = System.nanoTime();
		    StringBuilder sb2 = new StringBuilder("a");
		    int max3 = 1_000_000;
		    for (int i = 0; i < max3; i++) {sb2 = sb2.append("b");}
		    final double finish3 = System.nanoTime();
		    final double vs3 = finish3 - start3;
		    System.out.println("Using [StringBuilder] " + max3 + " times, Elapsed time: " + vs3 / 1_000_000.0 + " ms");
		   
		    DecimalFormat format = new DecimalFormat("####0.00");
		    
		    // StringBuilder vs StringBuffer
		    System.out.println("");
		    Double StringBuilder_vs_StringBuffer = vs2 / vs3;
		    System.err.println("StringBuilder vs StringBuffer: StringBuilder " + format.format(StringBuilder_vs_StringBuffer) + " times faster than StringBuffer");
	 
		    // StringBuilder vs String
		    Double StringBuilder_vs_String = vs1 / vs3;
		    System.err.println("StringBuilder vs String: StringBuilder " + format.format(StringBuilder_vs_String) + " times faster than String");
	 
		    // StringBuffer vs String
		    Double StringBuffer_vs_String = vs1 / vs2;
		    System.err.println("StringBuffer vs String: StringBuffer " + format.format(StringBuffer_vs_String) + " times faster than String");
	 }
}
