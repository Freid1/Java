package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Сортировка байт
*/

public class Solution {
    static int max=0;
    public static void main(String[] args) throws Exception {
        BufferedReader nameFile=new BufferedReader(new InputStreamReader(System.in));
        String file=nameFile.readLine();
        LinkedList<Integer> massiv=new LinkedList<>();

        FileInputStream readFile=new FileInputStream(file);
        while (readFile.available()>0){
            int fileBite=readFile.read();
            massiv.add(fileBite);
        }


        sort(massiv);


        nameFile.close();
        readFile.close();
    }
    static void sort(LinkedList<Integer> massiv){
        int[] tmp=new int[massiv.size()];
        for (int i = 0; i <massiv.size(); i++) {
            tmp[i]=massiv.get(i);
        }

        for (int i = 0; i <tmp.length-1; i++) {
            for (int j = i+1; j < tmp.length; j++) {
                if (tmp[i]==tmp[j])
                    tmp[j]=-1000;
            }
        }

        Arrays.sort(tmp);

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i]!=-1000)
                System.out.print(tmp[i]+" ");

        }


    }
}
