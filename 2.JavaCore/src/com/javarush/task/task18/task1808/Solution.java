package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInput=reader.readLine();
        String fileOutput1=reader.readLine();
        String fileOutput2=reader.readLine();

        FileInputStream fileInputStream=new FileInputStream(fileInput);
        FileOutputStream fileOutputStream1=new FileOutputStream(fileOutput1);
        FileOutputStream fileOutputStream2=new FileOutputStream(fileOutput2);
        int size=fileInputStream.available()/2;

        while (fileInputStream.available()>0){
        int data=fileInputStream.read();
            if (fileInputStream.available()>=size){

                fileOutputStream1.write(data);
                System.out.println("Файл1 выгружаем символ"+data);
            }
            else{
                fileOutputStream2.write(data);
                System.out.println("Файл2 выгружаем символ"+data);
            }
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();



}
}
