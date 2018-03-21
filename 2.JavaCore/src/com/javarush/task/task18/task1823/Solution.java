package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static volatile Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            } else {
                new ReadThread(fileName).start();
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : resultMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "  " + stringIntegerEntry.getValue());
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        FileInputStream fileInputStream;
        HashMap<Integer, Integer> mapa = new HashMap<>();

        public ReadThread(String fileName) throws FileNotFoundException {
            this.fileName=fileName;
            fileInputStream = new FileInputStream(fileName);
        }

        @Override
        public void run() {
            try {
                while (fileInputStream.available() > 0) {
                    int number = fileInputStream.read();
                    if (mapa.containsKey(number)) {
                        mapa.replace(number, mapa.get(number) + 1);
                    } else
                        mapa.put(number, 1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int max = 0;


            for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                }
            }

            for (Map.Entry<Integer, Integer> integerEntry : mapa.entrySet()) {
                if (max == integerEntry.getValue()) {

                    resultMap.put(fileName, integerEntry.getKey());
                }
            }

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
