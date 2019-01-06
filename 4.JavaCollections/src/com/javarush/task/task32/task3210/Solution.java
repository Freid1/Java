package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
RandomAccessFile randomAccessFile=new RandomAccessFile(args[0],"RW");
int lenNumber=Integer.parseInt(args[1]);
int lenText=args[2].length();

if(randomAccessFile.length()>lenNumber){
    randomAccessFile.seek(lenNumber);
    byte[] bytes=new byte[lenText];
    randomAccessFile.read(bytes,0,lenText);
    String textFile=new String(bytes);
    randomAccessFile.seek(randomAccessFile.length());
    if(textFile.equals(args[2])){
        randomAccessFile.write("true".getBytes());
    }else{
        randomAccessFile.write("false".getBytes());

    }
}


/*
Считать текст с файла начиная с позиции number, длинной такой же как и длинна переданного текста в третьем параметре.
Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
 */

//seek(long pos), read(byte b[], int off, int len), write(byte b[])
    }
}
