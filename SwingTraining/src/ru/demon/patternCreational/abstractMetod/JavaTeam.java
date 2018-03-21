package ru.demon.patternCreational.abstractMetod;

public class JavaTeam implements AbstractFactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public TestDeveloper createTestDeveloper() {
        return new JavaTester();
    }
}
