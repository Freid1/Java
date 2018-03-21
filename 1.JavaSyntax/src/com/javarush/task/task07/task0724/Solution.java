package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grendpa1=new Human("SDsd",true,55);
        Human grendpa2=new Human("SDswewd",true,54);
        Human grendma1=new Human("SDcxcxcsd",false,53);
        Human grendma2=new Human("SDsasdasdd",false,52);
        Human fa=new Human("SDasdazxcsd",true,45,grendpa1,grendma1);
        Human ma=new Human("SDasdassd",false,35,grendpa2,grendma2);
        Human ch1=new Human("SDszxcxd",true,5,fa,ma);
        Human ch2=new Human("Szxczxcd",false,15,fa,ma);
        Human ch3=new Human("xcx",true,8,fa,ma);
        System.out.println(grendpa1.toString());
        System.out.println(grendpa2.toString());
        System.out.println(grendma1.toString());
        System.out.println(grendma2.toString());
        System.out.println(fa.toString());
        System.out.println(ma.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());


    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       Human father;
       Human  mother;

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















