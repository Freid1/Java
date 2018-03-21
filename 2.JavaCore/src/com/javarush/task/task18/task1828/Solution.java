package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;

/*
Прайсы 2
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> text = new ArrayList<>();

        String path = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path = reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            if (args[0].equals("-u")) {
                while (bufferedReader.ready()) {
                    String stringId = bufferedReader.readLine();
                    String idString = stringId.substring(0, 8).trim();
                    if (idString.equals(args[1])) {
                        Formatter formatter=new Formatter();
                        formatter.format("%-8.8s%-30.30s%-8.8s%-4.4s",args[1],args[2],args[3],args[4]);
                        String lineString=formatter.toString();
                        text.add(lineString);
                    }else{
                        text.add(stringId);
                    }


                }

            }

            if (args[0].equals("-d")) {
                while (bufferedReader.ready()) {
                    String stringId = bufferedReader.readLine();
                    String idString = stringId.substring(0, 8).trim();
                    if (!idString.equals(args[1])) {
                        text.add(stringId);
                    }
                }

            }


        } catch (FileNotFoundException e) {
            System.out.println(e + " File not found");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (String s : text) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(" Wrong way");
        }

        for (String s : text) {
            System.out.println(s);
        }


    }

}
