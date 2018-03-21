package ru.demon.patternStructual.bridge;

public class MainMethod {
    public static void main(String[] args) {
Programm[] programms={
        new BankSystem(new Developer_Java()),
        new StockExchenge(new Developer_Cpp()),
};
        for (Programm programm : programms) {
            programm.developProgramm();
        }

    }
}
