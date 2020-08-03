package com.chandran.july2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Date : Date : July 9 2020.
*  @Purpose : This is one of the major new features in Java 8. A new package java.util.stream with new functionality which contains classes for processing sequences of elements.
*  @author chandran sellappan
 */

public class Java8Streams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[] { "P", "A", "V" };
		Stream<String> stream = Arrays.stream(arr);
		// Iterating
		stream.forEach(System.out::println);

		stream = Stream.of("V", "A", "P");
		stream.forEach(System.out::println);

		List<String> list = Arrays.asList("Pavan", "Opencodez");
		stream = list.stream();

		list.parallelStream().forEach(System.out::println);

		// Filtering
		list.stream().filter(element -> element.contains("P"));

		// Matching
		boolean isValid = list.stream().anyMatch(element -> element.contains("P"));
		System.out.println("Matching : " + isValid);

		// Collecting
		List<String> results = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		results.forEach(System.out::println);

		// Iterating over List
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(500, "Shifoo", 150000));
		list1.add(new Employee(504, "Oogway", 120000));
		list1.add(new Employee(503, "Tigress", 100000));
		list1.add(new Employee(730, "Mantis", 45000));

		System.out.println("Printing List with forEach");
		list1.forEach(employee -> System.out.println(employee));

		System.out.println("\nPrinting List after Filtering");
		list1.stream().filter(employee -> employee.getSalary() > 100000).forEach(System.out::println);
	}
}
