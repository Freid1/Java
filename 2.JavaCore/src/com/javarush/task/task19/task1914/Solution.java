package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream prStPodmena = new PrintStream(byteArrayOutputStream);
        System.setOut(prStPodmena);

        testString.printSomething();

        int sum = 0;
        String primer = byteArrayOutputStream.toString();
        if (primer.contains("-")) {
            int index = primer.indexOf("-");
            int first = Integer.parseInt((primer.substring(0, index - 1)).trim());
            int second = Integer.parseInt((primer.substring(index + 1, primer.indexOf("=") - 1)).trim());
            sum = first - second;

        } else if (primer.contains("+")) {
            int index = primer.indexOf("+");
            int first = Integer.parseInt((primer.substring(0, index - 1)).trim());
            int second = Integer.parseInt((primer.substring(index + 1, primer.indexOf("=") - 1)).trim());
            sum = first + second;
        }
        else if (primer.contains("*")) {
            int index = primer.indexOf("*");
            int first = Integer.parseInt((primer.substring(0, index - 1)).trim());
            int second = Integer.parseInt((primer.substring(index + 1, primer.indexOf("=") - 1)).trim());
            sum = first * second;
        }


        System.setOut(printStream);
       // System.out.format("%s %d",primer, sum);

        System.out.println(primer+sum);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

