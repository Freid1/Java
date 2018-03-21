package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("арбуз", "ягода");
        hashmap.put("банан", "трава");
        hashmap.put("вишня", "ягода");
        hashmap.put("груша", "фрукт");
        hashmap.put("дыня", "овощ");
        hashmap.put("ежевика", "куст");
        hashmap.put("жень-шень", "корень");
        hashmap.put("земляника", "ягода");
        hashmap.put("ирис", "цветок");
        hashmap.put("картофель", "клубень");
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {

            System.out.println(entry.getKey()+" - "+entry.getValue());

        }


    }
}
