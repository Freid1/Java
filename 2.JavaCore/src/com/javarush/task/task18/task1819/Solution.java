package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();

        FileInputStream fileInputStream=new FileInputStream(file1);
        FileInputStream fileInputStream1=new FileInputStream(file2);

        FileOutputStream fileOutputStream=new FileOutputStream(file1);

byte [] bufff=new byte[fileInputStream.available()];
fileInputStream.read(bufff);

while (fileInputStream1.available()>0){
    fileOutputStream.write(fileInputStream1.read());
}
fileOutputStream.write(bufff);
 reader.close();
 fileInputStream.close();
 fileInputStream1.close();
 fileOutputStream.close();






    }
}
