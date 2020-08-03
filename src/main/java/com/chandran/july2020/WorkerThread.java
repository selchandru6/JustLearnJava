package com.chandran.july2020;

/**
 * Date : Aug 3, 2020 3:10:55 PM
 *  Purpose : 
 *  @author : Chandran Sellappan
**/
public class WorkerThread  implements Runnable{
	@Override 
    public void run() { 
        // get current thread instance
        Thread t = Thread.currentThread();
        // call thread.getId() on the current t instance
        System.out.println("WorkerThread details : Name - "+ t.getName()); 
        System.out.println("Thread Id of Worker Thread - " + t.getId());
       
 
 }

}
