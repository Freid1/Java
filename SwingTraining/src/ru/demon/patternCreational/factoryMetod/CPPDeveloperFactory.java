package ru.demon.patternCreational.factoryMetod;

public class CPPDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CPPDeveloper();
    }
}
