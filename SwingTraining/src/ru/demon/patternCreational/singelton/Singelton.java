package ru.demon.patternCreational.singelton;

public class Singelton {
   //Ленивая иницииализация
    private Singelton instance;

    private Singelton() {

    }

    public Singelton getInstance() {
        if (instance == null) {
            return new Singelton();
        } else {
            return instance;
        }
    }

//     private Singelton instance =new Singelton;
//     private Singelton() {
//
//    }
//
//    public Singelton getInstance() {
//                   return instance;
//        }





}
