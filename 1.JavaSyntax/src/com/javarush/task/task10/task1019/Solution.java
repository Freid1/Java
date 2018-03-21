package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> list=new HashMap<>();
       while (true) {
           String strid=reader.readLine();
           if(strid.isEmpty()){
               break;
           }
           String name = reader.readLine();
           if(name.isEmpty()){
               break;
           }
           int id=Integer.parseInt(strid);
           list.put(name,id);


       }
        for (Map.Entry<String,Integer> entry : list.entrySet()) {
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }
}
