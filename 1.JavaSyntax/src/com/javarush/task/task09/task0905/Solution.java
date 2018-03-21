package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stack=Thread.currentThread().getStackTrace();
        int s=stack.length;
        System.out.println(s);
        return s;
    }
}

