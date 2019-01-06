package ru.demon.patternStructual.decorator;

public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJod() {
        return developer.makeJod();
    }
}
