package com.chandran.july2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Date : July 30th, 2020 3:07:39 PM Purpose : Sorting is to place elements in
 * increasing or decreasing order. Bubble sort is also known as sinking sort .
 * In this sorting algorithm , we keep comparing the adjacent pair , if they are
 * in not right order , then they swapped each other position . When there are
 * no elements swapped in one full iteration of element list , then it indicates
 * that bubble sort is completed.
 * 
 * @author : Chandran Sellappan
 **/
public class BubbleSort {

	public static int[] bubbleSort(int[] list) {
		for (int i = (list.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (list[j - 1] > list[j]) {
					// swap elements at j-1 and j
					int temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}

		return list;
	}

	public static void main(String args[]) throws Exception {
		String list = "";
		int i = 0, n = 0;

		BubbleSort s = new BubbleSort();
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

		elementlist = bubbleSort(elementlist);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Values after Bubble Sort : ");
		for (int j = 0; j < elementlist.length; j++) {
			System.out.println(elementlist[j] + " ");
		}
	}

}
