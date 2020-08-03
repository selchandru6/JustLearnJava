package com.chandran.july2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Date : July26, 2020 2:26:27 PM 
 * Purpose :  Merge sort is a divide and conquer algorithm  that was invented by John von Neumann in 1945.


 Merge sort works as follows
*   Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
*    Repeatedly merge sublists to produce new sublists until there is only 1 sublist remaining. This will be the  sorted list.
 * 
 * @author : Chandran Sellappan
 **/
public class MergeSort {

	public static int[] mergeSort(int[] list) {
		if (list.length <= 1) {
			return list;
		}

		// Split the array in half
		int[] first = new int[list.length / 2];
		int[] second = new int[list.length - first.length];
		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);

		// Sort each half
		mergeSort(first);
		mergeSort(second);

		// Merge the halves together, overwriting the original array
		merge(first, second, list);
		return list;
	}

	private static void merge(int[] first, int[] second, int[] result) {
		// Merge both halves into the result array
		// Next element to consider in the first array
		int iFirst = 0;
		// Next element to consider in the second array
		int iSecond = 0;

		// Next open position in the result
		int j = 0;
		// As long as neither iFirst nor iSecond is past the end, move the
		// smaller element into the result.
		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				result[j] = first[iFirst];
				iFirst++;
			} else {
				result[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		// copy what's left
		System.arraycopy(first, iFirst, result, j, first.length - iFirst);
		System.arraycopy(second, iSecond, result, j, second.length - iSecond);
	}

	public static void main(String args[]) throws Exception {
		String list = "";
		int i = 0, n = 0;

		MergeSort s = new MergeSort();
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please enter the list of elements,one element per line");
		System.out.println(" write 'STOP' when list is completed ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (!(list = bf.readLine()).equalsIgnoreCase("stop")) {
			int intelement = Integer.parseInt(list);
			arrlist.add(intelement);
		}
		int elementlist[] = new int[arrlist.size()];
		Iterator<Integer> iter = arrlist.iterator();
		for (int j = 0; iter.hasNext(); j++) {
			elementlist[j] = iter.next();
		}
		elementlist = mergeSort(elementlist);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Values after Merge Sort : ");
		for (int j = 0; j < elementlist.length; j++) {
			System.out.println(elementlist[j] + " ");
		}
	}
}
