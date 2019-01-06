package ru.demon.patternStructual.decorator;

public class Task {
    public static void main(String[] args) {
        Developer javaDeveloper=new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(javaDeveloper.makeJod());
    }
}
