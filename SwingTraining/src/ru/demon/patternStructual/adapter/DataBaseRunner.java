package ru.demon.patternStructual.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {

       DataBase dataBase=new AdapterData();

       dataBase.insert();
       dataBase.select();
       dataBase.remove();
       dataBase.update();
    }

}
