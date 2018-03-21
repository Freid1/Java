package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      int sum=0;

        while (true){

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String vvod=reader.readLine();
            if (vvod.equals("сумма")){
                System.out.println(sum);
                break;
            }

            int number= Integer.parseInt(vvod);

            sum+=number;



      }
    }
}
