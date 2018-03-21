package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = reader.readLine();
        int len = snumber.length();
        int number = Integer.parseInt(snumber);


            for (int j = 1; j < Math.pow(10, len); j = j * 10) {
                if ((number/j) % 2 == 0)
                    even++;
                else odd++;

            }



    System.out.println("Even: " + even + " Odd: " + odd);
    }
}
