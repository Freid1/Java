package ru.demon.patternStructual.adapter;

public class AdapterData extends JavaAplication implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deliteObject();
    }
}
