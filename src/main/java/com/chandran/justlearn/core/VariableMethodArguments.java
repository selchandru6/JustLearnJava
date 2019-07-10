package com.chandran.justlearn.core;

/*
 *  Date    : 07/09/2019.
 *  Purpose : This program is for Variable Arguments methods
 */


public class VariableMethodArguments {
    public static void main(String ... args){
        System.out.println("This is a program for Variable Arguments");
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,6,7));
        System.out.println(sum(1,2,3,4,5,6,7,8,9));

    }
    public static int sum(int ... inputValues){
        int result =  1;
        for(int i: inputValues){
            result = result * i;
        }

        return result;
    }
}
