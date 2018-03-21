package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
/*      HashMap<String,String> map=new HashMap<>();
      map.put("Фамилия1","Имя1");
      map.put("Фамилия2","Имя2");
      map.put("Фамилия3","Имя3");
      map.put("Фамилия4","Имя1");
      map.put("Фамилия5","Имя5");
      map.put("Фамилия1","Имя6");
      map.put("Фамилия7","Имя1");
      map.put("Фамилия8","Имя8");
      map.put("Фамилия9","Имя9");
      map.put("Фамилия10","Имя10");
return map;*/

        HashMap<String, String> map = new HashMap();
        for (int i =0;i < 10;i++){
            map.put("Surename"+i, "Name"+i);
        }

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int index=0;
        for (String s : map.values()) {
            if(s.equals(name))
                index++;
        }
        return index;
        }






    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int index=0;
        for (String s : map.keySet()) {
            if(s.equals(lastName))
                index++;
        }
        return index;
    }

    public static void main(String[] args) {

    }
}
