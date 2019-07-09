package com.chandran.justlearn.core;

/*
 *  Date    : 07/08/2019.
 *  Purpose : This program is swapping two numbers without temp variables.
 */

public class SwapingTwoNumbers {

    public static void main(String args[]){

        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);

    }
}
