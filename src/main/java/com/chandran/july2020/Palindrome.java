package com.chandran.july2020;
/**
 * Date : July 16, 2020 1:53:00 PM
 *  Purpose : Java Program to find whether a string or number is palindrome or not.
 *  @author : Chandran Sellappan
**/

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String original, reverse = "";
        int length;
        System.out.println("Enter the number or String");
        original ="MadaM";
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
	}

}
