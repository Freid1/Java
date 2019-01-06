package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null) {
            return "";
        }

        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String bufferedString;
        while ((bufferedString = bufferedReader.readLine()) != null) {
            byte[] bytes = bufferedString.getBytes();
            for (byte aByte : bytes) {
                if (aByte== 32||aByte==10){
                    stringBuilder.append((char) aByte);
                }
                else{
                stringBuilder.append((char) ((int)aByte+key));
            }
            }

        }
return stringBuilder.toString();
    }



    /*
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringWriter writer = new StringWriter();
        byte[] bufferedBytes;
        String stringInBufferedReader;
        while ((stringInBufferedReader=bufferedReader.readLine())!=null){
            bufferedBytes = stringInBufferedReader.getBytes();
            for (int i = 0; i < bufferedBytes.length ; i++) {
                if (bufferedBytes[i]== 32||bufferedBytes[i]==10)writer.write(bufferedBytes[i]);
                else writer.write(bufferedBytes[i]+key);
            }
        }
        bufferedReader.close();
        return writer.toString();*/
    }

