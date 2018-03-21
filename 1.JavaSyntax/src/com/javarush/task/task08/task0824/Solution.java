package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Human grandpa1;
        Human grandpa2;
        Human grandma1;
        Human grandma2;
        Human ma;
        Human pa;
        Human ch1;
        Human ch2;
        Human ch3;
        ch1 = new Human("dff", true, 12, null, null, null);
        ch2 = new Human("df232f", true, 13, null, null, null);
        ch3 = new Human("dff32", true, 14, null, null, null);

        pa = new Human("sdsds", true, 34, ch1, ch2, ch3);
        ma = new Human("sdsddsds", false, 34, ch1, ch2, ch3);

        grandma1 = new Human("Gren2323pa1", false, 56, pa, null, null);
        grandpa1 = new Human("Grenpa231", true, 56, pa, null, null);

        grandma2 = new Human("Grenpa231", false, 56, ma, null, null);
        grandpa2 = new Human("Gre232npa1", true, 56, ma, null, null);

        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());

        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());

        System.out.println(ma.toString());
        System.out.println(pa.toString());

        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());



    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, Human ch1, Human ch2, Human ch3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            ArrayList<Human> nov = new ArrayList<>();
            if (ch1 != null)
                nov.add(ch1);
            if (ch2 != null)
                nov.add(ch2);
            if (ch3 != null)
                nov.add(ch3);
            this.children = nov;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
