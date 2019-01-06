package com.javarush.task.task22.task2209;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()));

        StringBuilder fileReade = new StringBuilder("");
        while (readerFile.ready()) {
            fileReade.append(readerFile.readLine() + " ");
        }
        String[] world = fileReade.toString().split(" ");

        StringBuilder result = getLine(world);
        System.out.println(result.toString());

        reader.close();
        readerFile.close();

        // System.out.println(Arrays.deepToString(world));
    }

    public static StringBuilder getLine(String... words) {
        String [] worts=new String[words.length];
        for (int i = 0; i < worts.length; i++) {
            worts[i] = words[i];
        }
        Arrays.sort(worts);
        StringBuilder result = new StringBuilder();
        String next = "";
        if (words == null || words.length == 0)
            return result;
        if (worts != null) {
            if (!(worts[0].equalsIgnoreCase(""))) {
               if(worts[0].length()>1){
                result.append(worts[0] + " ");
                next = worts[0].substring(worts[0].length() - 1, worts[0].length());
                worts[0] = " ";}
                for (int i = 1; i < worts.length; i++) {
                    for (int j = 1; j < worts.length; j++) {
                        if (worts[j].substring(0, 1).equalsIgnoreCase(next)) {
                            result.append(worts[j] + " ");
                            next = worts[j].substring(worts[j].length() - 1, worts[j].length());
                            worts[j] = " ";
                        }
                    }

                }
                for (String wort : worts) {
                    if (!(words.equals(" "))) {
                        result.append(wort);
                    }
                }

            }
        }

        return result;
    }
}
