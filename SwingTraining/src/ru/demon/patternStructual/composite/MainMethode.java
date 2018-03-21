package ru.demon.patternStructual.composite;

public class MainMethode {

    public static void main(String[] args) {


        TeamComposit team = new TeamComposit();

        team.addDeveloper(new Developer_Java());
        team.addDeveloper(new Developer_Cpp());

        team.createTeam();

    }
}