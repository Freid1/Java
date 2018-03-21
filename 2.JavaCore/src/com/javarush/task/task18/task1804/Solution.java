package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader nameFile=new BufferedReader(new InputStreamReader(System.in));
        String file=nameFile.readLine();
        LinkedList<Integer> massiv=new LinkedList<>();



        FileInputStream readFile=new FileInputStream(file);
        while (readFile.available()>0){

            int fileBite=readFile.read();
            massiv.add(fileBite);
        }

        HashMap<Integer,Integer> ansver=podschet(massiv);
        for (Map.Entry<Integer, Integer> entry : ansver.entrySet()) {
            if (entry.getValue()==min)
                System.out.print(entry.getKey()+" ");
        }


        nameFile.close();
        readFile.close();
    }
    static HashMap<Integer,Integer> podschet(LinkedList<Integer> massiv){
        HashMap<Integer,Integer> result=new HashMap<>();

        for (Integer integer : massiv) {
            int count=1;
            for (Integer integer1 : massiv) {
                if (integer==integer1){
                    count++;

                }
                result.put(integer,count);
            }
        }



        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if(entry.getValue()<min)
                min=entry.getValue();
        }


        return result;
    }
}