package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(reader.readLine());

        }
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (index < list.get(i).length())
                index = list.get(i).length();
            else {
                System.out.println(i);
            break;
            }
        }


    }
}

