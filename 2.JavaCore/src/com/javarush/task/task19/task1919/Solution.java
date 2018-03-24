package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] lineSepareted = reader.readLine().split(" ");
                map.merge(lineSepareted[0], Double.parseDouble(lineSepareted[1]), Double::sum);
            /*    if (map.containsKey(lineSepareted[0])) {
                    map.replace(lineSepareted[0], map.get(lineSepareted[0]), map.get(lineSepareted[0]) + Double.parseDouble(lineSepareted[1]));
                } else {
                    map.put(lineSepareted[0], Double.parseDouble(lineSepareted[1]));
                }*/

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
