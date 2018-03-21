package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> alpaNumber = new LinkedHashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            alpaNumber.put(abcArray[i], 0);
        }

        for (int i = 0; i < list.size(); i++) {
            char[] tmp = list.get(i).toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                for (Map.Entry<Character, Integer> entry : alpaNumber.entrySet()) {
                    if (entry.getKey().equals(tmp[j]))
                        entry.setValue(entry.getValue() + 1);
                }

            }


        }
        for (Map.Entry<Character, Integer> entry : alpaNumber.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}


