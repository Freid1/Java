package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя1");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия1", "Имя6");
        map.put("Фамилия7", "Имя1");
        map.put("Фамилия8", "Имя8");
        map.put("Фамилия9", "Имя9");
        map.put("Фамилия10", "Имя10");
        return map;

        /*  HashMap<String, String> map = new HashMap();
        for (int i =0;i < 10;i++){
            map.put("Surename"+i, "Name"+i);
            map.put("Surename"+i, "Name"+i);
        }

        return map;*/

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iter = copy.entrySet().iterator();
        Iterator<Map.Entry<String, String>> iter2 = copy.entrySet().iterator();
        for (Map.Entry<String, String> entry : copy.entrySet()) {
            for (Map.Entry<String, String> entry2 : copy.entrySet()) {
                if (entry.getValue().equals(entry2.getValue())&&!(entry.getKey().equals(entry2.getKey())))
                    removeItemFromMapByValue(map, entry.getValue());
            }
        }





    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}
