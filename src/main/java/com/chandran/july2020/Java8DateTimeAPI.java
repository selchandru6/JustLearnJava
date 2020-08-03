package com.chandran.july2020;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
 * Date : July 8 2020.
 * This program is for Java 8 new Date API example.
 * 
 * Java 8 comes with a new date-time API under the package java.time. The new API is thread safe. 
 * Out of whole new classes under this new API, you may want to know few first like LocalDate, LocalTime, LocalDateTime, DateTimeFormatter
 *  
 */

public class Java8DateTimeAPI {

	public static void main(String[] args) {
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date = " + today);

		LocalDate todayNewYork = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in America = " + todayNewYork);

		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time = " + time);

		LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Time in America = " + timeNewYork);

		// Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current DateTime = " + now);

		System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")));

	}

}
