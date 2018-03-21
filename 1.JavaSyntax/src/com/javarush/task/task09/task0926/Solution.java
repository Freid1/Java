package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list =new ArrayList<>();
        list.add(creatArray(5));
        list.add(creatArray(2));
        list.add(creatArray(4));
        list.add(creatArray(7));
        list.add(creatArray(0));

        return list;
    }

    public static int[] creatArray(int size){
        int[] arrayInt=new int[size];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i]=i;
                    }
        return arrayInt;
    }


    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
