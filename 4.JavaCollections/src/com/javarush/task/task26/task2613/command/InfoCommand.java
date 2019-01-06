package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;

import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.info_en", Locale.ENGLISH);

    @Override
    public void execute() {
        boolean hasMoney = false;
        ConsoleHelper.writeMessage(res.getString("before"));
        Iterator<CurrencyManipulator> iterator =
                CurrencyManipulatorFactory.getAllCurrencyManipulators().iterator();
        while (iterator.hasNext()) {
            CurrencyManipulator manipulator = iterator.next();
            if (manipulator.hasMoney()) {
                hasMoney = true;
                ConsoleHelper.writeMessage(manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
            }
        }
        if (CurrencyManipulatorFactory.getAllCurrencyManipulators().isEmpty() || !hasMoney) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
        }
    }
}