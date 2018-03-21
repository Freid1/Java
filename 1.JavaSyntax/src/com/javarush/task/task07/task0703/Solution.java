package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] arrayStr=new String[10];
        int[] arrayInt=new int[10];
        for (int i = 0; i < arrayStr.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrayStr[i]=reader.readLine();

        }
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i]=arrayStr[i].length();

        }
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);

        }

    }
}
