package com.chandran.july2020;

/**
 * Date : July 31, 2020 3:10:13 PM 
 * Purpose : ThreadId can be obtained from the Thread.currentThread()  method. 
 * @author : Chandran Sellappan
 **/
public class ThreadIdExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WorkerThread workerthreadobject = new WorkerThread();
		// below is the first constructor : setting name also
		Thread t1 = new Thread(workerthreadobject);
		t1.setName("First Thread");
		t1.start();
		// below is the second constructor : setting name as argument
		Thread t2 = new Thread(workerthreadobject, "Second Thread");
		t2.start();
		// below we will not set any name of the thread
		Thread t3 = new Thread(workerthreadobject);
		t3.start();

// Getting the current thread object i.e Main thread 
		Thread currentThread = Thread.currentThread();

// Printing Main thread : name and id  
		System.out.println("Executing  thread : " + currentThread.getName());
		System.out.println("id of the thread is " + currentThread.getId());
	}

}
