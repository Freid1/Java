package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));

        }
        int number = 0;
        for (int i = 0; i < 10; i++) {
            int index = 0;
            for (int j = i; j < 10; j++) {
                if (array.get(i).equals(array.get(j))) {
                    index++;
                }
                else break;

            }
            if (number < index) {
                number = index;
            }


        }

        System.out.println(number);


    }
}