package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        list = change(list, m);
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> change(ArrayList<String> anylist, int m) {
        for (int i = 0; i < m; i++) {
            anylist.add(anylist.get(0));
            anylist.remove(0);

        }

        return anylist;
    }

}