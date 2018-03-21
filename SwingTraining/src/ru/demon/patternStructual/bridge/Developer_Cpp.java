package ru.demon.patternStructual.bridge;

public class Developer_Cpp implements Developer {
    @Override
    public void createCode() {
        System.out.println("Crete Cpp code.....");
    }
}
