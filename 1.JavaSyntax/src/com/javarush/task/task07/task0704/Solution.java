package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     int [] arrayInt= new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arrayInt[i] = Integer.parseInt(reader.readLine());

        }
        invert(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            int i1 = arrayInt[i];
            System.out.println(i1);
        }

    }
    public static void invert(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=tmp;
        }
    }
}

