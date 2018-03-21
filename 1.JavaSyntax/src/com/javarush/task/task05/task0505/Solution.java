package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1=new Cat("Cat1", 3,4,7);
        Cat cat2=new Cat("Cat2", 2,3,8);
        Cat cat3=new Cat("Cat3", 4,5,6);
        boolean result1=cat1.fight(cat2);
        boolean result2=cat1.fight(cat3);
        boolean result3=cat2.fight(cat3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
