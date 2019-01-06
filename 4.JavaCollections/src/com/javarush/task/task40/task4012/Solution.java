package com.javarush.task.task40.task4012;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/* 
Полезные методы DateTime API
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isLeap(LocalDate.of(2016,10,10)));
        System.out.println(isBefore(LocalDateTime.of(2020,10,10,0,0,0)));
        System.out.println(getPeriodBetween(LocalDate.of(2001,1,1),LocalDate.of(2000,1,1)));
        //System.out.println(addTime(LocalTime.now(),10,ChronoUnit.MONTHS));
    }

    public static boolean isLeap(LocalDate date) {
        return date.isLeapYear();

    }

    public static boolean isBefore(LocalDateTime dateTime) {
        LocalDateTime today = LocalDateTime.now();
        return dateTime.isBefore(today);

    }

    public static LocalTime addTime(LocalTime time, int n, ChronoUnit chronoUnit) {
        LocalTime localTime = time.plus(n, chronoUnit);
        return localTime;
    }

    public static Period getPeriodBetween(LocalDate firstDate, LocalDate secondDate) {
        Period period;
        if (firstDate.isBefore(secondDate)) {
            period = Period.between(firstDate, secondDate);
        } else {
            period = Period.between(secondDate, firstDate);
        }
        return period;

    }
}
