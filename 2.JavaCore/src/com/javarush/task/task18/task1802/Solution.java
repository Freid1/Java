package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader nameFile=new BufferedReader(new InputStreamReader(System.in));
        String file=nameFile.readLine();
        int maxFile=Integer.MAX_VALUE;
        FileInputStream readFile=new FileInputStream(file);
        while (readFile.available()>0){

            int fileBite=readFile.read();
            if(fileBite<maxFile)
                maxFile=fileBite;
        }
        System.out.println(maxFile);
        nameFile.close();
        readFile.close();
    }
}
