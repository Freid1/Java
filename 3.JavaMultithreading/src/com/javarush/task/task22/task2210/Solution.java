package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getTokens("level22.lesson13.task01", ".")));

    }
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> arrayList=new ArrayList<>();
        StringTokenizer tokenizer=new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens()){
            arrayList.add(tokenizer.nextToken());

        }
        String[] retToken=new String[arrayList.size()];
        for (int i = 0; i < retToken.length; i++) {
            retToken[i]=(String) arrayList.get(i);

        }

        return retToken ;
    }
}
