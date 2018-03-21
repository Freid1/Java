package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(reader.readLine()));

        }
        for (Integer integer : list) {
            if (integer % 3 == 0 || integer % 2 == 0) {
                if (integer % 3 == 0) {
                    list1.add(integer);
                }
                if (integer % 2 == 0) {
                    list2.add(integer);
                }
            } else

                list3.add(integer);
                }

                printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
