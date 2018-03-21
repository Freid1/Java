package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
             result.add(new Cat());

        }

        return result;
    }

    public static Set<Dog> createDogs() {
       HashSet<Dog> dogs=new HashSet<>();
        for (int i = 0; i < 3; i++) {
             dogs.add(new Dog());

        }

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> animal= new HashSet<Object>(cats);
        for (Dog dog : dogs) {
            animal.add(dog);
        }
        return animal;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        HashSet<Object> copy=new HashSet<Object>(pets);
        for (Object pet : copy) {
            for (Cat cat : cats) {
                if (pet.equals(cat))
                    pets.remove(cat);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

   public static class Dog{

   }
   public static class Cat{

   }
}
