package ru.demon.patternCreational.builder;

public class MainMethod {
    public static void main(String[] args) {
        Director director=new Director();

        director.setBuilder(new StudentWebSite());
        WebSite webSite=director.buildWebSite();
        System.out.println(webSite);
    }
}
