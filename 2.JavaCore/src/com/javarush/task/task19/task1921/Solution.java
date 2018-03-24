package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {


    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            String[] line = reader.readLine().split(" ");
            String name = "";
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < line.length; i++) {
                try {a.add(Integer.parseInt(line[i])); }
                catch (Exception e){
                    name = name + line[i] + " ";
                }
            }
            int d = a.get(0);
            int m = a.get(1);
            int y = a.get(2);
            Date date = new GregorianCalendar(y,m - 1 ,d).getTime();
            PEOPLE.add(new Person(name.trim(), date));
        }
        reader.close();

        for (Person person : PEOPLE) {
            System.out.println(person.getName()+person.getBirthday());
        }


    }
}
