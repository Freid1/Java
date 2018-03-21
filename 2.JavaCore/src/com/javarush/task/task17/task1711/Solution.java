package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        int id = 0;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        ParsePosition pp = new ParsePosition(0);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], df.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i + 1].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], df.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                }
                break;

            case "-u":
            {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        try {
                            id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            Sex sex = args[i + 2] == "м" ? Sex.MALE : Sex.FEMALE;
                            Date bd = df.parse(args[i + 3]);
                            Person person = allPeople.get(id);
                            person.setName(name);
                            person.setSex(sex);
                            person.setBirthDay(bd);

                        } catch (Exception e) {}
                    }
                }
            }
                break;

            case "-d":
                synchronized (allPeople) {
                    Person person;
                    int manyLoops = (args.length - 1);
                    for (int i = 0; i < manyLoops; i++) {
                        person = allPeople.get(Integer.parseInt(args[1 + (i * 1)]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        Date date = allPeople.get(id).getBirthDay();
                        String s = allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж";
                        System.out.println(allPeople.get(id).getName() + " " + s + " " + sdf.format(date));
                    }
                }
                break;
        }
    }
}
