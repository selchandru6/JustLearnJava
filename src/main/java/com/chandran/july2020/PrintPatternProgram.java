package com.chandran.july2020;

import java.util.Scanner;

/**
 * Date : July 23, 2020 2:18:14 PM Purpose : 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3
 * 4 5 6 1 2 3 4 5 6 7
 * 
 * @author : Chandran Sellappan
 **/
public class PrintPatternProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking rows value from the user

		System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		System.out.println("Here is your pattern....!!!");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Close the resources

		sc.close();

	}

}
