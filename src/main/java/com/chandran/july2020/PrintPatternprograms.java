package com.chandran.july2020;

import java.util.Scanner;

/**
 * Date : July 22, 2020 2:14:32 PM Purpose : Print the following pattern. 1 2 3
 * 4 5 6 7 2 3 4 5 6 7 3 4 5 6 7 4 5 6 7 5 6 7 6 7 7 6 7 5 6 7 4 5 6 7 3 4 5 6 7
 * 2 3 4 5 6 7 1 2 3 4 5 6 7
 * 
 * @author : Chandran Sellappan
 **/
public class PrintPatternprograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking rows value from the user

		System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		System.out.println("Here is your pattern....!!!");

		// Printing upper half of the pattern

		for (int i = 1; i <= rows; i++) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Printing i to rows value at the end of each row

			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Printing lower half of the pattern

		for (int i = rows - 1; i >= 1; i--) {
			// Printing i spaces at the beginning of each row70

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// Printing i to rows value at the end of each row

			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// Closing the resources

		sc.close();
	}

}
