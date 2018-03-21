package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
    private   String name;
        private  short age;
        private   boolean sex;
        private  int number;
        private  long phone;
        private  String woman;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, short age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, short age, boolean sex, int number, long phone, String woman) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.number = number;
            this.phone = phone;
            this.woman = woman;
        }

        public Human(String name, short age, boolean sex, int number, long phone) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.number = number;
            this.phone = phone;
        }

        public Human(String name, short age, boolean sex, int number) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.number = number;
        }

        public Human(String name, short age, boolean sex) {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(short age, boolean sex, int number, long phone, String woman) {
            this.age = age;
            this.sex = sex;
            this.number = number;
            this.phone = phone;
            this.woman = woman;
        }

        public Human(String name, short age, boolean sex, int number, String woman) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.number = number;
            this.woman = woman;
        }

        public Human(String name, String woman) {
            this.name = name;
            this.woman = woman;
        }

        public Human(String name, short age, boolean sex, long phone, String woman) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.phone = phone;
            this.woman = woman;
        }
    }
}
