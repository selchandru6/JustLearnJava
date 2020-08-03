package com.chandran.aug2020;

import java.util.ArrayList;
import java.util.List;

/**
 * Date : Aug 2, 2020 3:23:38 PM 
 * Purpose : The total used / free memory of an
 * program can be obtained in the program via java.lang.Runtime.getRuntime();
 * The runtime has several method which relates to the memory. The following
 * code example demonstrate its usage.
 * 
 * @author : Chandran Sellappan
 **/
public class MemoryTest {

	/**
	 * @param args
	 */
	private static final long MEGABYTE = 1024L * 1024L;

	public static long bytesToMegabytes(long bytes) {
		return bytes / MEGABYTE;
	}

	public static void main(String[] args) {
		// I assume you will know how to create a object Person yourself...
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i <= 900000; i++) {
			list.add(new Person("Jim", "Knopf"));
		}
		// Get the Java runtime
		Runtime runtime = Runtime.getRuntime();
		// Run the garbage collector
		runtime.gc();
		// Calculate the used memory
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used memory is bytes: " + memory);
		System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
	}

}

class Person {
	
	String fname;
	String lname;
	
	public Person(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
		
	}
}
