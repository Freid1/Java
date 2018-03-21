package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum=0;
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            sum+=n;
            if (n==-1){
                System.out.println(sum);
                break;
            }

        }
    }
}
