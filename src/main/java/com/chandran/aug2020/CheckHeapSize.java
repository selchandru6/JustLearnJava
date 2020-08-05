package com.chandran.aug2020;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.text.DecimalFormat;

/**
 * Date : Aug 4, 2020 3:43:05 PM 
 * Purpose : Program to view the current heap size
 * that an application is using.
 * 
 * @author : Chandran Sellappan
 **/
public class CheckHeapSize {
	
	
      
	public static void main(String[] args) {
		long heapSize = Runtime.getRuntime().totalMemory();

		// Get maximum size of heap in bytes. The heap cannot grow beyond this size.//
		// Any attempt will result in an OutOfMemoryException.
		long heapMaxSize = Runtime.getRuntime().maxMemory();

		// Get amount of free memory within the heap in bytes. This size will increase
		// // after garbage collection and decrease as new objects are created.
		long heapFreeSize = Runtime.getRuntime().freeMemory();

		System.out.println("heapsize" + formatSize(heapSize));
		System.out.println("heapmaxsize" + formatSize(heapMaxSize));
		System.out.println("heapFreesize" + formatSize(heapFreeSize));

		MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage heapMemoryUsage = memBean.getHeapMemoryUsage();

		System.out.println("Max memory allowed for jvm : " + getDynamicSpace(heapMemoryUsage.getMax())); // max memory allowed for jvm
																						// -Xmx flag (-1 if isn't
																						// specified)
		System.out.println("Given memory to JVM : " + getDynamicSpace(heapMemoryUsage.getCommitted())); // given memory to JVM by OS (
																						// may fail to reach getMax, if
																						// there isn't more memory)
		System.out.println("used now by your heap : " + getDynamicSpace(heapMemoryUsage.getUsed())); // used now by your heap
		System.out.println(" -Xms flag : " + getDynamicSpace(heapMemoryUsage.getInit())); // -Xms flag
	}

	public static String formatSize(long v) {
		if (v < 1024)
			return v + " B";
		int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
		return String.format("%.1f %sB", (double) v / (1L << (z * 10)), " KMGTPE".charAt(z));
	}
	
	public static String getDynamicSpace(long diskSpaceUsed)
	{
	    if (diskSpaceUsed <= 0) {
	        return "0";
	    }

	    final String[] units = new String[] { "B", "KiB", "MiB", "GiB", "TiB" };
	    int digitGroups = (int) (Math.log10(diskSpaceUsed) / Math.log10(1024));
	    return new DecimalFormat("#,##0.#").format(diskSpaceUsed / Math.pow(1024, digitGroups))
	            + " " + units[digitGroups];
	}
}
