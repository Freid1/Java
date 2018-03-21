package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
       HashMap<String,Integer> salory=new HashMap<>();
       salory.put("fsdfsf", 550);
       salory.put("fsdfs2", 250);
       salory.put("fsdfs3", 550);
       salory.put("fsdfs4", 550);
       salory.put("fsdfs5", 550);
       salory.put("fsdfs6", 550);
       salory.put("fsdfs7", 450);
       salory.put("fsdfs8", 750);
       salory.put("fsdfs9", 250);
       salory.put("fsdfsf10", 350);
       return  salory;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy=new HashMap<String, Integer>(map);
         for (Map.Entry<String, Integer> entry : copy.entrySet()) {
         if (entry.getValue()<500){
       map.remove(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}