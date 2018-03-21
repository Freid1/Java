package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream sout=System.out;

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();
        String strprint=byteArrayOutputStream.toString();

        Pattern p=Pattern.compile("[t][e]");
        Matcher m=p.matcher(strprint);
        strprint=m.replaceAll("??");


        System.setOut(sout);

        System.out.println(strprint);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
