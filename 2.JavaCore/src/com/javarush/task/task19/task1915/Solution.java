package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream pSytem = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();

        String string = byteArrayOutputStream.toString();

        try (FileOutputStream fileWriter=new FileOutputStream(new File(fileName))) {
           fileWriter.write(byteArrayOutputStream.toByteArray());
           fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.setOut(pSytem);
        System.out.println(string);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

