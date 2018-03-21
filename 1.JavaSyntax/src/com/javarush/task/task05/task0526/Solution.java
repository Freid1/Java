package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1=new Man("man1",12,"xaasas");
        man1.tosout();
        Man man2=new Man("man2",12,"xaasas");
        man2.tosout();
        Woman woman1=new Woman("man2",12,"xaasas");
        woman1.tosout();
        Woman woman2=new Woman("man2",12,"xaasas");
        woman2.tosout();
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void tosout(){
            System.out.println(name + " " + age + " "+address);
        }

    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void tosout(){
            System.out.println(name + " " + age + " "+address);
        }
    }


}
