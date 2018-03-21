package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String readFile="";
        String writeFile="";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
             readFile = reader.readLine();
             writeFile = reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }

        try (BufferedReader readerFile = new BufferedReader(new FileReader(readFile));) {
            try (BufferedWriter writerFile = new BufferedWriter(new FileWriter(writeFile))) {
                while (readerFile.ready()) {
                    String tmpString = readerFile.readLine();
                    Pattern p = Pattern.compile("[\\p{Punct}]");
                    Matcher m = p.matcher(tmpString);
                    String writeString=m.replaceAll("");
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
