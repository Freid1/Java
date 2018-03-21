package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();
static {

        try {
            String [] rows = new Scanner(new File(Statics.FILE_NAME)).useDelimiter("\\Z").next().split("\n");
            for (String s : rows) {
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

}
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
