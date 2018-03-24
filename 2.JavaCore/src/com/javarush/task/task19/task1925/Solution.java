package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] stringsReader = reader.readLine().split(" ");
                for (int i = 0; i < stringsReader.length; i++) {
                    if (stringsReader[i].length() > 6) {
                        builder.append(stringsReader[i] + ",");

                    }

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
        writer.write(builder.toString().substring(0,builder.toString().length()-1));
        writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
