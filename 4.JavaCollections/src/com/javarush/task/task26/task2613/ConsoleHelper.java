/*
package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConsoleHelper {

    private static ResourceBundle res=ResourceBundle.getBundle(CashMachine.class.getPackage().toString()
            .substring(8,CashMachine.class.getPackage().toString().length())+".resources.common_en", Locale.ENGLISH);

    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException {
        String input = "";
        try {
            input = bis.readLine();
            if (input.equalsIgnoreCase("exit")) {
                throw new InterruptOperationException();
            }
        } catch (IOException ignored) {}

        return input;
    }

    public static String askCurrencyCode() throws InterruptOperationException {

        String currencyCode = "";
        while (true) {
            writeMessage(res.getString("choose.currency.code"));
            currencyCode = readString();
            if (currencyCode.length() == 3) {
                break;

            }
            writeMessage("Неправельный ввод кода, повторите еще раз!!!");
        }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] massiv = new String[100];
        writeMessage("Пожалуйста введите два целых числа через пробел");
        writeMessage("Первое число наминал, второе количество банкнот");
        while (true) {
            String string = readString();
            if (string.split(" ").length == 2) {
                massiv = string.split(" ");
                try {
                    Integer.parseInt(massiv[0]);
                    Integer.parseInt(massiv[1]);
                    break;
                } catch (NumberFormatException e) {
                    writeMessage("введите два целых числа через пробел");
                }
            }
            writeMessage("введите два целых числа через пробел");
        }
        return massiv;
    }

    public static Operation askOperation() throws InterruptOperationException {
        while (true){
            writeMessage("Введите код операции");
            writeMessage("1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT;");
            try {
                int code=Integer.parseInt(readString());
                if(code>0&&code<5){
                 return Operation.getAllowableOperationByOrdinal(code);
                }else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                writeMessage("Wrong code!!!");
            }
        }
    }
}
*/
package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Polurival
 * on 18.02.2016.
 */
public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.common_en", Locale.ENGLISH);

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException {
        String result = null;
        try {
            result = bis.readLine();
            if (res.getString("operation.EXIT").equals(result.toUpperCase())) {
                ConsoleHelper.writeMessage(res.getString("the.end"));
                throw new InterruptOperationException();
            }
            return result;
        } catch (IOException e) {
        }
        return null;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String result = "";
        while (result.length() != 3) {
            //writeMessage("Enter currency code (3 characters):");
            writeMessage(res.getString("choose.currency.code"));
            result = readString();
        }
        return result.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] result = new String[2];


        String inString = "";
        while (!inString.matches("^\\d+ \\d+$")) {
            //writeMessage("Enter nominal and amount (nominal amount):");
            writeMessage(res.getString("choose.denomination.and.count.format"));
            inString = readString();
        }
        result[0] = inString.substring(0, inString.indexOf(' '));
        result[1] = inString.substring(inString.indexOf(' ') + 1);

        return result;
    }

    public static Operation askOperation() throws InterruptOperationException {
        boolean isOperation = false;
        while (!isOperation) {
            try {
                //writeMessage("Enter number of operation (1 - INFO, 2 — DEPOSIT, 3 — WITHDRAW, 4 — EXIT):");
                writeMessage(res.getString("choose.operation") +
                        " (1 - " + res.getString("operation.INFO") +
                        ", 2 — " + res.getString("operation.DEPOSIT") +
                        ", 3 — " + res.getString("operation.WITHDRAW") +
                        ", 4 — " + res.getString("operation.EXIT") + "):");
                int numberOfOperation = Integer.parseInt(readString());
                Operation operation = Operation.getAllowableOperationByOrdinal(numberOfOperation);
                return operation;
            } catch (IllegalArgumentException e) {
            }
        }
        return null;
    }
/*
    public static void main(String[] args) {
        //System.out.println(askCurrencyCode());
        //System.out.println(Arrays.toString(getValidTwoDigits(askCurrencyCode())));
        System.out.println(askOperation());
    }
*/
}