package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try (BufferedReader readerF = new BufferedReader(new FileReader(fileName))) {
            while (readerF.ready()) {
                String[] strings = readerF.readLine().split(" ");
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < strings.length; i++) {
                    String string = strings[i];
                    try {
                        if (map.containsKey(Integer.parseInt(string))) {
                            builder.append(map.get(Integer.parseInt(string))+" ");

                        }
                        if (!map.containsKey(Integer.parseInt(string))) {
                            builder.append(string+" ");

                        }
                    } catch (NumberFormatException e) {
                        builder.append(string+" ");
                    }

                }
                System.out.println(builder.toString());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

