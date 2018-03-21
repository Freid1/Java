package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dayWeek = Integer.parseInt(reader.readLine());
if ((dayWeek%400==0))
    System.out.println("количество дней в году: 366");

else if(!(dayWeek%400==0)&&(!(dayWeek%100==0))&&dayWeek%4==0)
    System.out.println("количество дней в году: 366");
else
    System.out.println("количество дней в году: 365");




    }
}