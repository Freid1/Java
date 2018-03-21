package ru.demon.patternCreational.factoryMetod;

public class Programm {
    DeveloperFactory developerFactory;
    public static void main(String[] args) {





    }

    static DeveloperFactory configure(String developer){
        if(developer.equals("Cpp")){
            return new CPPDeveloperFactory();
        }
        else if (developer.equals("Java")){
            return new JavaDeveloperFactory();
        }
        else
            return null;
    }



}
