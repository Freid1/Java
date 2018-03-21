package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> map= new HashMap<>();
        map.put("Man","jon1");
        map.put("Man1","jon2");
        map.put("Ma2","jon3");
        map.put("Ma3","jon4");
        map.put("Man4","jon");
        map.put("Man5","jon");
        map.put("Man6","jon5");
        map.put("Man7","jon6");
        map.put("Man","jon7");
        map.put("Man","jon8");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
