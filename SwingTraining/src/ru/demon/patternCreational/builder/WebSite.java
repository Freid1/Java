package ru.demon.patternCreational.builder;

public class WebSite {
    private String name;
    private String surname;
    private String addres;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return name+"  "+surname+"  "+addres;
    }
}
