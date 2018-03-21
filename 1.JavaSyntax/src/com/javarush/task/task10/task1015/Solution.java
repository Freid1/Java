package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list=new ArrayList[3];
      ArrayList<String> a1=new ArrayList<>();
      ArrayList<String> a2=new ArrayList<>();
      ArrayList<String> a3=new ArrayList<>();
      a1.add("dsdsd");
      a1.add("dsdsd");
      a2.add("fdf");
      a2.add("fdf");
      a3.add("gd");
      a3.add("gd");


    list[0]=a1;
    list[1]=a2;
    list[2]=a3;

return list;


      /*
          ArrayList<String>[] arrStrList =  new ArrayList[5];
        for (int i = 0, len=arrStrList.length; i < len; i++) {
            arrStrList[i] = new ArrayList<String>();
            arrStrList[i].add(String.valueOf(i));
        }
        return arrStrList;
 */
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}