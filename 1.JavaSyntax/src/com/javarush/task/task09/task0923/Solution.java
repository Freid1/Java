package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inline = reader.readLine();

        char[] text = inline.toCharArray();
        ArrayList<Character> glasnie = new ArrayList<>();
        ArrayList<Character> soglasnay = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            if (text[i]!=' '){
                if (isVowel(text[i]))
                glasnie.add(text[i]);

            else {
                soglasnay.add(text[i]);
            }}
        }
        for (Character character : glasnie) {
            System.out.print(character+" ");
        }
        System.out.println();
        for (Character character : soglasnay) {
            System.out.print(character+" ");

        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}