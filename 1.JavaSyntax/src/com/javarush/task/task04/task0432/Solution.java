package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String asd=reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        int count=0;
        while (count<n){
            System.out.println(asd);
            count++;
        }

    }
}
