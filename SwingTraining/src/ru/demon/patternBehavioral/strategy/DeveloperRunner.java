package ru.demon.patternBehavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.setActivity(new Coding());
        developer.execute();

        developer.setActivity(new Sleeping());
        developer.execute();
    }

}
