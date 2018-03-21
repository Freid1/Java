package ru.demon.patternStructual.bridge;

public class BankSystem extends Programm {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramm() {
        developer.createCode();
    }
}
