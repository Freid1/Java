package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String str1=reader.readLine();
        String str2=reader.readLine();

        FileInputStream fileInputStream=new FileInputStream(str1);
        FileOutputStream fileOutputStream=new FileOutputStream(str2);

        int[] buf=new int[fileInputStream.available()] ;

        for (int i = 0;fileInputStream.available()>0; i++) {
           buf[i]=fileInputStream.read();

        }

        for (int i = buf.length-1; i>=0; i--) {
            fileOutputStream.write(buf[i]);

        }

    reader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }





}
