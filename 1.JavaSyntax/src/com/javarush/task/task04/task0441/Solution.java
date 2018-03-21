package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(a, b);
        int max2 = Math.max(max, c);
        int min = Math.min(a, b);
        int min2 = Math.min(min, c);

        int medium = ((a + b + c) - max2 - min2);
        System.out.println(medium);


    }
}