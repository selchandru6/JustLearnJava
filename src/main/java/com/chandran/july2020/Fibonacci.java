/**
 * Date : July 17, 2020 1:55:41 PM
 *  Purpose : Java Program for the Fibonacci series.
 *  @author : Chandran Sellappan
**/
package com.chandran.july2020;

/**
 * @author chandransellappan
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num, a = 0, b = 0, c = 1;
		System.out.println("Enter the number of times");
		num = 100;
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + ""); // if you want to print on the same line, use print()
		}
	}
}
