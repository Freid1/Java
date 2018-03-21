package com.javarush.task.task04.task0419;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array=new int [4];
        int max=-999999;
        for (int i = 0; i <4; i++) {
            int n = Integer.parseInt(reader.readLine());
            array[i]=n;
        }
        for (int i = 0; i < 4; i++) {
            if(max<array[i])
                max=array[i];

        }
        System.out.println(max);

    }
}