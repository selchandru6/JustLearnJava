package com.chandran.july2020;

/**
 * Date : July 15, 2020 1:50:01 PM Purpose : Java Program to find whether a
 * number is prime or not.
 * 
 * @author : Chandran Sellappan
 **/

public class FindPrime {
	public static void main(String[] args) {
		int temp, num;
		boolean isPrime = true;
		num = 23;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + "number is prime");
		else
			System.out.println(num + "number is not a prime");
	}
}
