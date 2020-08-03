package com.chandran.july2020;

import java.util.HashMap;

/**
 * Date : July 14, 2020 1:47:18 PM 
 * Purpose : Java Program to count the number of
 * words in a string using HashMap.
 * 
 * @author : Chandran Sellappan
 **/

public class FinalCountWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] split = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}
}
