package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nfor = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        if (nfor > 0) {
            for (int i = 0; i < nfor; i++) {
                int n = Integer.parseInt(reader.readLine());
                if (n > maximum)
                    maximum = n;


            }
            System.out.println(maximum);
        }
    }
}