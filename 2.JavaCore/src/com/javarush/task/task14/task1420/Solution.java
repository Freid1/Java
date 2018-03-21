package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        ArrayList<Integer> array =new ArrayList<>();
        while (count<2) {
            int number = Integer.parseInt(reader.readLine());
            try {
                if(number>0) {
                    array.add(number);
                    count++;
                }
                else throw new Exception();

            } catch (Exception e) {
                System.out.println("Wrong number");
            }

        }

int a=array.get(0);
int b=array.get(1);
        System.out.println(gcd(a,b));





    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd (b, a % b);
    }
}
