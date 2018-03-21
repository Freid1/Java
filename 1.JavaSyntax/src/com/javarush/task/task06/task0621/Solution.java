package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandpaName = reader.readLine();
        Cat catGrandpa = new Cat(GrandpaName);

        String GrandmaName = reader.readLine();
        Cat catGrandma = new Cat(GrandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null, catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,  catMother,catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMather;
        private Cat parentFather;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parentMather, Cat prentFather) {
            this.name = name;
            this.parentMather = parentMather;
            this.parentFather = prentFather;
        }

        @Override
        public String toString() {
            if (parentMather == null && parentFather == null) {
                return "Cat name is " + name + ", no mother, no father";
            } else if (parentFather == null && parentMather != null) {
                return "Cat name is " + name + ", mother is " + parentMather.name + ", no father";
            } else if (parentFather != null && parentMather == null) {
                return "Cat name is " + name + ", no mother, father is " + parentFather.name;
            } else {
                return "Cat name is " + name + ", mother is " + parentMather.name + ", father is " + parentFather.name;
            }
        }
    }

}
