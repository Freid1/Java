package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {

                String[] arraysString = reader.readLine().split(" ");

                for (int i = 0; i < arraysString.length; i++) {
                    String s = arraysString[i];
                    char[] chars = s.toCharArray();

                    for (int j = 0; j < chars.length; j++) {
                        if (Character.isDigit(chars[j])) {

                            builder.append(s + " ");
                            break;
                        }

                    }
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter writer2 = new BufferedWriter(new FileWriter(args[1]));
        writer2.write(builder.toString());
        writer2.flush();
        writer2.close();

    }


}

