package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

import java.util.Hashtable;

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
Object o=new String();
Integer i=(Integer) o;
    }

    public void methodThrowsNullPointerException() {
        Hashtable<Integer,String> array=new Hashtable<>();
        array.put(null,null);
    }

    public static void main(String[] args) {
        VeryComplexClass veryComplexClass=new VeryComplexClass();
        veryComplexClass.methodThrowsNullPointerException();

    }
}
