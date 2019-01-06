package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Charset utf8=Charset.forName("UTF-8");
        Charset win1251=Charset.forName("Windows-1251");

        byte[] inputByte;
        FileInputStream fileInputStream= new FileInputStream(new File(args[0]));
        FileOutputStream fileOutputStream=new FileOutputStream(new File(args[1]));

        inputByte=new byte[fileInputStream.available()];
        fileInputStream.read(inputByte);

        String s =new String(inputByte,win1251);

        inputByte=s.getBytes(utf8);

        fileOutputStream.write(inputByte);

        fileInputStream.close();
        fileOutputStream.close();


    }
}
