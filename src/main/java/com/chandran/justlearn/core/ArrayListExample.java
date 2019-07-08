package com.chandran.justlearn.core;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        System.out.println("al "+al);

        ArrayList<String> alc = (ArrayList) al.clone();

        System.out.println("ALC "+alc);

        alc.add("Clone");
        al.add("Clone1");

        System.out.println("al " +al);

        System.out.println("alc " +al);

    }
}
