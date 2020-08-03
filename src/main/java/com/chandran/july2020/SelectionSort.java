package com.chandran.july2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Date : July 29, 2020 3:05:37 PM Purpose : Sorting is to place elements in
 * increasing or decreasing order. Selection sort is a simple sorting algorithm
 * .
 * 
 * The algorithm divides the input lists into two parts ; the sublist of the
 * items are already sorted ,which is built up from left to right at the
 * front(left) of the list , and the sublist of the items remaining to be sorted
 * that occupy the rest of the list. Initially the sorted sublist is empty and
 * the unsorted sublist is the entire input list .The algorithm proceeds by
 * finding the smallest (or largest depending on the sorting order ) element in
 * the unsorted sublist exchanging it with the leftmost unsorted element
 * (putting in sorted order) and moving the sublist boundaries one element to
 * the right .
 * 
 * @author : Chandran Sellappan
 **/
public class SelectionSort {

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int[] selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the index of the minimum value
			int minPos = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[minPos]) {
					minPos = j;
				}
			}
			swap(list, minPos, i);
		}
		return list;
	}

	public static void main(String args[]) throws Exception {
		String list = "";
		int i = 0, n = 0;

		SelectionSort s = new SelectionSort();
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

		elementlist = selectionSort(elementlist);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Values after Selection Sort : ");
		for (int j = 0; j < elementlist.length; j++) {
			System.out.println(elementlist[j] + " ");
		}
	}
}
