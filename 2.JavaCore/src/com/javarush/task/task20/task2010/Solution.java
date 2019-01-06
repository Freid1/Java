package com.javarush.task.task20.task2010;

import java.io.*;

/*
Как сериализовать что-то свое?
*/
public class Solution {
    public static int countStrings;

  public static class Object implements Serializable {
        public String string1;
        public String string2;

    }

    public static class String implements Serializable {
        private final int number;
        public String() {
            number = ++countStrings;
        }
        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) throws IOException {
        File tmpPath= File.createTempFile("Tmp.txt", "null");
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(tmpPath));
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(tmpPath));


    }
}
