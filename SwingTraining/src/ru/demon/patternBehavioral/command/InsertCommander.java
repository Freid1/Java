package ru.demon.patternBehavioral.command;

public class InsertCommander implements Command {
    DataBase dataBase;

    public InsertCommander(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
