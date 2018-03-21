package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(reader.readLine());
    f(number);
    }
    static void f(int n){
        if (n==0)
            System.out.println(0);
        else if (n>0)
            System.out.println(n*2);
        else System.out.println(n+1);
    }

}