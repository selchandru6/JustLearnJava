package com.chandran.july2020;

import java.util.Arrays;

/**
 * Date : July 21, 2020 2:10:09 PM 
 * Purpose : Anagram - If two strings contain same set of characters but in different order then the two strings are called anagrams.
 * @author : Chandran Sellappan
 **/
public class Anagram {
	public static void main(String[] args) throws java.lang.Exception {
		boolean result = isAnagram("now", "own");
		System.out.println("Is it Anagram : "+result);
	}

	public static boolean isAnagram(String first, String second) {
		// remove all whitespaces and convert strings to lowercase
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();

		/*
		 * check whether string lengths are equal or not, if unequal then not anagram
		 */
		if (first.length() != second.length())
			return false;

		// convert string to char array
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();

		// sort both the arrays
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		// checking whether both strings are equal or not
		return Arrays.equals(firstArray, secondArray);
	}
}
