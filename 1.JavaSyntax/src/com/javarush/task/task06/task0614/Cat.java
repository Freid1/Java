package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats=new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {

            Cat.cats.add(new Cat());

        }

        printCats();
    }

    public static void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat);

        }

        }

}
