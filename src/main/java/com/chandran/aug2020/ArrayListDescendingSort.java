package com.chandran.aug2020;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Date : Aug 3, 2020 3:19:17 PM Purpose : I have already shared sorting of
 * ArrayList in ascending order. In this post we will learn how to sort an
 * ArrayList in descending order (decreasing order).
 * 
 * @author : Chandran Sellappan
 **/
public class ArrayListDescendingSort {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("Apple");
	    arraylist.add("Banana");
	    arraylist.add("Pear");
	    arraylist.add("Mango");

	    /*Unsorted List: ArrayList content before sorting*/
	    System.out.println("ArrayList Before Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	  }

	    /* Sorting in decreasing (descending) order*/
	    Collections.sort(arraylist, Collections.reverseOrder());

	    /* Sorted List in reverse order*/
	    System.out.println("ArrayList in descending order:");
	    for(String str: arraylist){
	   System.out.println(str);
	    }
	  }

}
