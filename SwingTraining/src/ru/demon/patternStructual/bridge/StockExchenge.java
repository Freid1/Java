package ru.demon.patternStructual.bridge;

public class StockExchenge extends Programm {
    protected StockExchenge(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramm() {
developer.createCode();
    }
}
