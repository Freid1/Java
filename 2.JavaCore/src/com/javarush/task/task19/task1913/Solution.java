package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream psout=System.out;

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String str=byteArrayOutputStream.toString();

        Pattern pattern=Pattern.compile("\\p{Digit}");
        Matcher matcher=pattern.matcher(str);
        String str1="";
        while (matcher.find()){
        str1=str1+matcher.group();
        }




        System.setOut(psout);
        System.out.println(str1);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
