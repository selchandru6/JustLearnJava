package com.chandran.justlearn.core;

        /*
         *  Date : 07/07/2019.
         */


import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;


public class Java8DateAndTime {


    public static  void main(String args[]) {

        Date today = new Date();

        System.out.println(" today "+today);

        LocalDateTime now = LocalDateTime.now(Clock.systemUTC());
        System.out.println("Now : "+now);

        LocalDateTime nowCST = LocalDateTime.now();
        System.out.println("Now : "+nowCST);

    }
}
