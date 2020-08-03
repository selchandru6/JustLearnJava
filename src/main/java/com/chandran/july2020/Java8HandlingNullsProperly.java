package com.chandran.july2020;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Date : Date : July 10 2020.12:29:30 PM Purpose : Let's learn how to use Java
 * 8's Optionals to make your null checks simple and less error-prone! Author :
 * chandran sellappan
 **/

public class Java8HandlingNullsProperly {

	/**    
	 * @param args
	 */
	public static final List<String> NAMES = Arrays.asList("Rita", "Gita", "Nita", "Ritesh", "Nitesh", "Ganesh",
			"Yogen", "Prateema");

	public static void main(String[] args) {
		System.out.println(" Names Start with N " + pickLuckyNameOldWay(NAMES, "N"));

		System.out.println(" Names Start with N " + pickLuckyNameWIsPresent(NAMES, "X"));
	}

	public static String pickLuckyNameOldWay(final List<String> names, final String startingLetter) {
		String luckyName = null;
		for (String name : names) {
			if (name.startsWith(startingLetter)) {
				luckyName = name;
				break;
			}
		}
		return luckyName != null ? luckyName : "No lucky name found";
	}

	public static String pickLuckyNameWIsPresent(final List<String> names, final String startingLetter) {
		final Optional<String> luckyName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
		return luckyName.isPresent() ? luckyName.get() : "No lucky name found";
	}

	public static String pickLuckyNameWOrElse(final List<String> names, final String startingLetter) {
		final Optional<String> luckyName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
		return luckyName.orElse("No lucky name found");
	}

	public static void pickLuckyNameOldWay1(final List<String> names, final String startingLetter) {
		String luckyName = null;
		for (String name : names) {
			if (name.startsWith(startingLetter)) {
				luckyName = name;
				break;
			}
		}
		if (luckyName != null) {
			postMessage(luckyName);
		}
	}
	/*  This method used to format */
	public static void postMessage(final String winnerName) {
		System.out.println(String.format("Congratulations, %s!", winnerName));
	}

}
