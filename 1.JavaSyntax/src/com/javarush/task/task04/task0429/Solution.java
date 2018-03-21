package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int plus=0;
        int minus=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <3 ; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n>0)
                plus++;
            else if (n<0)
                minus++;

        }
        System.out.println("количество отрицательных чисел: "+minus);
        System.out.println("количество положительных чисел: "+plus);



    }
}
