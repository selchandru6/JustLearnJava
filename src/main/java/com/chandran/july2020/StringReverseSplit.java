package com.chandran.july2020;

/**
 * Date : July 11, 2020 1:39:01 PM Purpose : Java Program to reverse a string
 * without using String inbuilt function reverse
 * 
 * @author : Chandran Sellappan
 **/

public class StringReverseSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Saket Saurav";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
	}
}
