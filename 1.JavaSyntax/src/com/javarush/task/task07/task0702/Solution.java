package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrray=new String[10];
        for (int i = 0; i < 8; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrray[i]=reader.readLine();
        }

        for (int i =arrray.length-1 ; i >=0; i--) {
            String s = arrray[i];
            System.out.println(s);

        }
    }
}