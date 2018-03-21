package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readFile = reader.readLine();
        String writeFile = reader.readLine();
reader.close();

        try (BufferedReader readerFile = new BufferedReader(new FileReader(readFile));) {
            try (BufferedWriter writerFile = new BufferedWriter(new FileWriter(writeFile))) {
                while (readerFile.ready()) {
                    String tmpString = readerFile.readLine();
                    Pattern p = Pattern.compile("[.]");
                    Matcher m = p.matcher(tmpString);
                    String writeString=m.replaceAll("!");
       writerFile.write(writeString);
       writerFile.flush();

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
