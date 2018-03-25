package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] lineSepareted = reader.readLine().split(" ");
                map.merge(lineSepareted[0], Double.parseDouble(lineSepareted[1]), Double::sum);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }

        TreeMap<String, Double> mapName = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                mapName.put(entry.getKey(), entry.getValue());
            }
        }

        for (String s : mapName.keySet()) {
            System.out.println(s);
        }



    }
}
