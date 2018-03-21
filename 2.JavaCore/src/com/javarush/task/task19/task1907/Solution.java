package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);
        StringBuilder stringBuilder = new StringBuilder("");
        String text="";

        while (fileReader.ready()) {
            stringBuilder.append((char) fileReader.read());
        }

        Pattern patternAll = Pattern.compile("[a-z]");
        Matcher matcherAll = patternAll.matcher(stringBuilder);

        while (matcherAll.find()) {
            text=text+matcherAll.group();
        }

        Pattern pattern = Pattern.compile("\\bworld\\b");  //"[w][o][r][l][d]");
        Matcher matcher = pattern.matcher(stringBuilder);

        int cout=0;
        while (matcher.find()){
            cout++;
        }



        System.out.println(cout);

        reader.close();
        fileReader.close();
    }
}
