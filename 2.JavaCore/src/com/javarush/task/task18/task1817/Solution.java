package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(args[0]);
        int countAll=0;
        int countSpace=0;
while (fileInputStream.available()>0){
    countAll++;
    if(fileInputStream.read()==32){
        countSpace++;
    }
    }


    double numberCount=((double) countSpace/(double) countAll)*100;

        System.out.printf("%.2f",numberCount);
        fileInputStream.close();
    }
}
