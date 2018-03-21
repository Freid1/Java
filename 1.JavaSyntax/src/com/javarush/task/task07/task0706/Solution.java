package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] street = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < street.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            street[i] = Integer.parseInt(reader.readLine());

            if (i == 0)
                even += street[i];
            else if (i % 2 == 0)
                even += street[i];
            else
                odd += street[i];

        }
        if (odd > even)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");


    }
}
