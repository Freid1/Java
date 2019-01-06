package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
       if(telNumber==null||telNumber==""){
           return false;
       }
        Pattern p3=Pattern.compile("^\\+\\d{12}");
        Pattern p4=Pattern.compile("^\\+\\d{2}\\(\\d{3}\\)\\d{7}");
        Pattern p2=Pattern.compile("^\\+\\d{8}-\\d{2}-\\d{2}");
        Pattern p1=Pattern.compile("^\\d{6}-\\d{4}");

        Matcher matcher1=p1.matcher(telNumber);
        Matcher matcher2=p2.matcher(telNumber);
        Matcher matcher3=p3.matcher(telNumber);
        Matcher matcher4=p4.matcher(telNumber);

        return (matcher1.find()||matcher2.find()||matcher3.find()||matcher4.find());



    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("050123456"));

    }
}
