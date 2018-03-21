package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
    this.name=name;

    age=5;
    weight=5;
    address=null;
    color="red";
}

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        address=null;
        color="red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

        weight=5;
        address=null;
        color="red";
            }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;

        name=null;
        age=5;

    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;

        name=null;
        age=5;
        address=null;

    }

    public static void main(String[] args) {

    }
}
