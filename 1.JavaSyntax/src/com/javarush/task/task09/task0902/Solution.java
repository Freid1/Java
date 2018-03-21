package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static StackTraceElement[] stack  =Thread.currentThread().getStackTrace();
    public static void main(String[] args) throws Exception {

        method1();
       }

    public static String method1() {
        method2();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return StackTrace[2].getMethodName();
    }

    public static String method2() {
         method3();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return StackTrace[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return StackTrace[2].getMethodName();
    }

    public static String method4() {

        method5();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
                return StackTrace[2].getMethodName();
    }

    public static String method5() {

     StackTraceElement[] stack  =Thread.currentThread().getStackTrace();
        return stack[2].getMethodName();
    }
}
