package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead=reader.readLine();
        String fileWrite=reader.readLine();

        BufferedReader bufferedReader=new BufferedReader(new FileReader(fileRead));

        String stringBuilder="";

        while (bufferedReader.ready()){
            stringBuilder=stringBuilder+bufferedReader.readLine();
        }

        String [] massivString=new String[stringBuilder.length()];

        massivString=stringBuilder.split(" ");

        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(fileWrite));
        for (String s : massivString) {
            try {
                int sss=Integer.parseInt(s);
                bufferedWriter.write(s+" ");
            } catch (NumberFormatException e) {

            }

        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        reader.close();







    }
}
