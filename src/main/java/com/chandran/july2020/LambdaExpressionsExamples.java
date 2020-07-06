package com.chandran.july2020;

/*
 * Date : July 5 2020.
 * This program is for Java 8 lambda Expressions example.
 *  
 */
interface MyInterface {
	void abstract_func(int x, int y);

	default void default_Fun() {
		System.out.println("This is default method");
	}
}

public class LambdaExpressionsExamples {
	public static void main(String args[]) {
		// lambda expression
		MyInterface fobj = (int x, int y) -> System.out.println(x + y);
		System.out.print("The result = ");
		fobj.abstract_func(5, 5);
		fobj.default_Fun();
	}
}
