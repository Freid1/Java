package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();

        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> arrayNew = new ArrayList<>();
        Pattern patternCreational = Pattern.compile("[?&][a-z]+(=&)?");

        Matcher matcher = patternCreational.matcher(str);
        while (matcher.find()) {

            array.add(matcher.group());
        }
        for (String s : array) {

            char[] asd = s.toCharArray();

            char[] linesa = new char[s.length() - 1];
            for (int i = 0; i < linesa.length; i++) {
                linesa[i] = asd[i + 1];
            }


            String sout = String.valueOf(linesa);

            arrayNew.add(sout);
            System.out.print(sout + " ");
        }
        for (String s : arrayNew) {

            if (s.equals("obj")){
                Pattern patternNumber=Pattern.compile("([0-9]+.[0-9]+)|([0-9]+)");
                Matcher matcherNumber=patternNumber.matcher(str);
                while (matcherNumber.find()){
                    System.out.println();

                    try {
                        alert(Double.parseDouble(matcherNumber.group()));
                    } catch (NumberFormatException e) {
                        alert(matcherNumber.group());
                    }


                    }
                }

        }



    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().replaceAll("^.+[/?]","");
        reader.close();
        String[] strings = s.split("&");
        for (String str:strings) System.out.print(str.replaceAll("[=].+$","") + " ");
        for (String str:strings) {
            System.out.println();
            if(str.replaceAll("=.*$","").equals("obj")) {

                try {
                    alert(Double.parseDouble(str = str.replaceAll("^.+[=]","")));
                } catch (Exception e) {
                    alert(str);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}