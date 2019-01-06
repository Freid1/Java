package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.command.CommandExecutor;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            Operation operation;
            operation = Operation.LOGIN;
            CommandExecutor.execute(operation);
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        } catch (InterruptOperationException e) {
            ConsoleHelper.writeMessage("You have interrupted operation. Bye ...");
        }
        /*String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        *//*for (int i = 0; i < 3; i++) {
            String[] denom = ConsoleHelper.getValidTwoDigits(currencyCode);
            currencyManipulator.addAmount(Integer.parseInt(denom[0]), Integer.parseInt(denom[1]));
        }
        //System.out.println(currencyManipulator.getDenominations());
        System.out.println(currencyManipulator.getCurrencyCode());*//*
        System.out.println(currencyManipulator.getTotalAmount());*/
    }
}