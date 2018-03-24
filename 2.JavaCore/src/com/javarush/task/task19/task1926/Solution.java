package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        reader.close();

        try (BufferedReader readerStrem=new BufferedReader(new FileReader(fileName))){
            while (readerStrem.ready()){
                String line=readerStrem.readLine();
                char [] str=line.toCharArray();
                for (int i = str.length-1; i >=0; i--) {
                    System.out.print(str[i]);
                }
                System.out.println();
            }
        }




    }
}
