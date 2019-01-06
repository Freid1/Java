package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        boolean digit = false;
        boolean letterUpper = false;
        boolean letterLower = false;
        int number = 0;
        Random random = new Random();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int[] arrays=new int[8];
        while (number < 8) {
            int data = random.nextInt(122);
            if (Character.isDigit(data)) {
                arrays[number]=data;
                number++;
                digit = true;
            }
            if (Character.isLowerCase(data)) {
                arrays[number]=data;
                number++;
                letterLower = true;

            }
            if (Character.isUpperCase(data)) {
                arrays[number]=data;
                number++;
                letterUpper = true;

            }
            if (number == 8) {
                if (!(digit && letterLower && letterUpper)) {
                    number = 0;
                }
            }

        }
        for (int i = 0; i <arrays.length ; i++) {
            byteArrayOutputStream.write(arrays[i]);
        }

        return byteArrayOutputStream;
    }
}
/*48-57 digits
65-90
97-122

 */