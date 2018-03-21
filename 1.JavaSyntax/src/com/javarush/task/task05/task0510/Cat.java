package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String address;
    String color;



    public void initialize (String name) {
        this.name = name;

        this.weight = 4;
        this.age = 5;
        this.address = null;
        this.color ="red";
    }

    public  void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;

        this.address = null;
        this.color ="red";
    }
    public  void initialize (String name, int age) {
        this.name = name;
        this.age = age;

        this.weight = 4;
        this.address = null;
        this.color ="red";
    }
    public  void initialize (int weight, String color) {
        this.color = color;
        this.weight = weight;

        this.name = null;
        this.age = 5;
        this.address = null;


    }
        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.address = address;
            this.color = color;

            this.name = null;
            this.age = 5;


        }

    public static void main(String[] args) {

    }
}
