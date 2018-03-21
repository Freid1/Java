package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date finish = new Date(date);
        Date start = new Date(date);
        start.setMonth(0);
        start.setDate(0);
        System.out.println(finish);
        System.out.println(start);
        long starter = start.getTime();
        long finisher = finish.getTime();
        long day = (finisher - starter) / (24 * 60 * 60 * 1000);

        if (day % 2 == 0)
            return false;
        else
            return true;


    }
}
