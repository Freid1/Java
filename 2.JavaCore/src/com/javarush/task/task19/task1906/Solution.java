package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String inStringPath=reader.readLine();
        String outStringPath=reader.readLine();

        FileReader inputStreamReader=new FileReader(inStringPath);

        FileWriter fileOutputStream=new FileWriter(outStringPath);

        StringBuilder stringBuilder=new StringBuilder("");
        while (inputStreamReader.ready()){
            stringBuilder.append(Character.toChars(inputStreamReader.read()));
        }

        System.out.println(stringBuilder);
        for (int i = 0; i <stringBuilder.length() ; i++) {
            if(!(i%2==0)){
                fileOutputStream.write(stringBuilder.charAt(i));
            }


        }

        reader.close();
        inputStreamReader.close();
        fileOutputStream.close();


    }
}