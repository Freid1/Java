package ru.demon.patternCreational.abstractMetod;

public class CppTeam implements AbstractFactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public TestDeveloper createTestDeveloper() {
        return new CppTester();
    }
}
