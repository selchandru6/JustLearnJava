package com.chandran.july2020;

/**
 * Date : July 13, 2020 1:44:46 PM Purpose : Java Program to swap two numbers
 * without using the third variable.
 * 
 * @author : Chandran Sellappan
 **/

public class SwapTwoNumberWithoutThirdVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int x, y;
	      System.out.println("Enter x and y");
	     
	      x = 3;
	      y = 7;
	  
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	      x = x + y;
	      y = x - y;
	      x = x - y;
	  
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	}
}
