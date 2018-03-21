package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name=reader.readLine();
        InputStream stream=new FileInputStream(name);
        while (stream.available()>0){
            int data=stream.read();
            System.out.print((char)data);
        }

        reader.close();
        stream.close();
    }
}