package com.chandran.justlearn.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


/*
 *  Date : 07/04/2019.
 */


public class DeepCloneExample {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1l, "adam", new Date(1982, 02, 12)));

        System.out.println(employeeList);

        ArrayList<Employee> employeeListClone = new ArrayList<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()){
            employeeListClone.add((Employee) iterator.next().clone());
        }

        employeeListClone.get(0).setId(2l);
        employeeListClone.get(0).setName("brian");
        employeeListClone.get(0).getDob().setDate(13);;

        employeeListClone.add(new Employee(100L,"Chandran",new Date()));

        System.out.println(employeeList);
        System.out.println(employeeListClone);
    }
}
