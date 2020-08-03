package com.chandran.july2020;
/**
 * Date : July 12, 2020 1:41:44 PM
 *  Purpose : Java Program to swap two numbers using the third variable.
 *  @author : Chandran Sellappan
**/
public class SwapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y, temp;
        System.out.println("Enter x and y");
        
        x = 5;
        y = 7;
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);
	}

}
