package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    String name;
    int height;
    String color;

    public Dog(String name, int age) {
        this.name = name;
        this.height = age;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.height = age;
        this.color = color;
    }

    public Dog(String name) {

        this.name = name;
    }

    public static void main(String[] args) {

    }
}
