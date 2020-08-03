package com.chandran.aug2020;

/**
 * Date : Aug 3, 2020 3:33:49 PM 
 * Purpose : For a long-running java code, which
 * makes heavy use of dynamic memory, we may end up with Out-Of-Memory errors
 * due to a memory shortage of the heap space.
 * 
 * In the below program, we can test the free java heap space used by a program.
 * If the heap space is used more than 90 percent, then the garbage collector is
 * explicitly called. The System.gc() call is blocking the calling thread until
 * the garbage collector has completed. Therefore, this code can be executed in
 * a separate thread.
 * 
 * @author : Chandran Sellappan
 **/
public class GCTest {

	private static final long MEGABYTE = 1024L * 1024L;

	public void runGC() {
		Runtime runtime = Runtime.getRuntime();
		long memoryMax = runtime.maxMemory();
		long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("MemoryMax : " + memoryMax + " in MB : " + bytesToMegabytes(memoryMax));
		System.out.println("MemoryUsed : " + memoryUsed + " in MB : " + bytesToMegabytes(memoryUsed));
		double memoryUsedPercent = (memoryUsed * 100.0) / memoryMax;
		System.out.println("memoryUsedPercent: " + memoryUsedPercent);
		if (memoryUsedPercent > 90.0)
			System.gc();
	}

	public static void main(String args[]) {
		GCTest test = new GCTest();
		test.runGC();
	}

	public static long bytesToMegabytes(long bytes) {
		return bytes / MEGABYTE;
	}

}
