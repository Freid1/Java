package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path = "C://javaFiles/";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(path + reader.readLine()));
        PrintWriter wr = new PrintWriter(writer);
        try {

            while (true){
                String str  = reader.readLine();
                wr.println(str);

                if(str.equals("exit")) break;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        wr.close();
        reader.close();
        writer.close();

    }
}