package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        String data;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));

            while ((data = readerFile.readLine()) != null) {
            if (Integer.parseInt(data) % 2 == 0)
                array.add(Integer.parseInt(data));
        }
        Collections.sort(array);
        reader.close();
        readerFile.close();
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }



}
