package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings=new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();
            strings.add(s);

        }
        for (String string : strings) {

            if (string.length() > max)
                max = string.length();
        }
        for (String string : strings) {
            if(string.length()==max)
                System.out.println(string);
        }

    }
}
