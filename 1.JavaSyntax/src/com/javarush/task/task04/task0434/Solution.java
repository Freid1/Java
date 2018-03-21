package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int count=1;
        while (count<11){
            int count2=1;
            while (count2<11){
                System.out.print(count*count2+" ");
                count2++;
            }

            count++;
            System.out.println();
        }


    }
}
