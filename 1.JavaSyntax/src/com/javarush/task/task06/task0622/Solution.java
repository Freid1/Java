package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] numberArray=new int[5];
        for (int i = 0; i <5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            numberArray[i]=number;
        }
        sort(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);

        }

    }
    public static void sort(int [] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    int tmp=array[i+1];
                    array[i+1]=array[i];
                    array[i]=tmp;
                }


            }
        }


    }

}
