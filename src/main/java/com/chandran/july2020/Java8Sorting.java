package com.chandran.july2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * Date : July 6 2020.
 * This program is for Java 8 lambda Expressions example.
 *  
 */

public class Java8Sorting {

	public static void main(String[] args) {

		Comparator<Employee> lambdaSortByName = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());

		Comparator<Employee> sortByName = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(503, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));

		System.out.println("Initial List :");
		list.forEach(System.out::println);

		// sortByName already defined in above snippet
		Collections.sort(list, sortByName);
		System.out.println("\nStandard Sorted by Name :");
		list.forEach(System.out::println);

		// lambdaSortByName already defined in above snippet
		list.sort(lambdaSortByName);
		System.out.println("\nLambda Sorted by Name :");
		list.forEach(System.out::println);

		Comparator<Employee> lambdaSortById = (Employee e1, Employee e2) -> e1.getId() - e2.getId();
		list.sort(lambdaSortById);

		System.out.println("\nSorted by Id :");
		list.forEach(System.out::println);

	}

}
