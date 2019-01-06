package ru.demon.patternBehavioral.command;

public class DataBseRunner {
    public static void main(String[] args) {


        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommander(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase));
        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

    }
}
