package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int [] arrayBig=new int[20];
        int [] array1=new int[10];
        int [] array2=new int[10];

        for (int i = 0; i < arrayBig.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrayBig.length; i++) {
            if(i<10){
                array1[i]=arrayBig[i];
            }
            else
                array2[i-10]=arrayBig[i];

        }
        for (int i = 0; i < array2.length; i++) {
            int i1 = array2[i];
            System.out.println(i1);
        }
    }
}
