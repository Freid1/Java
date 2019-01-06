package ru.demon.patternBehavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<String> vacansies) {
        System.out.println("Dear "+name+"\n"+"We have some vacancies"+vacansies);
        System.out.println();
    }
}
