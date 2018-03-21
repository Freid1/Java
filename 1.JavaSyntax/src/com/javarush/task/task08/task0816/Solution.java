package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("AUGUST 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("AUGUST 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("AUGUST 1 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("JUNe 1 1980"));
        map.put("Stallone8", new Date("JULY 1 1980"));
        map.put("Stallone9", new Date("June 1 1980"));
        map.put("Stallone10", new Date("June 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterV = map.entrySet().iterator();
while(iterV.hasNext()){
    Map.Entry<String,Date> pair=iterV.next();
    if (pair.getValue().getMonth()==5)
        iterV.remove();
    else if (pair.getValue().getMonth()==6)
        iterV.remove();
    else if (pair.getValue().getMonth()==7)
        iterV.remove();
}






    }

    public static void main(String[] args) {
/*HashMap<String,Date> date=createMap();
removeAllSummerPeople(date);
        for (Date date1 : date.values()) {
            System.out.println(date1);
        }*/
    }
}
