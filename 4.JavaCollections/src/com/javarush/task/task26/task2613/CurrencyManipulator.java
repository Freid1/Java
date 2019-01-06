package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.NotEnoughMoneyException;

import java.util.*;

public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations = new HashMap<>();

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination))
            count += denominations.get(denomination);
        denominations.put(denomination, count);
    }

    public int getTotalAmount() {
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            result += entry.getKey() * entry.getValue();
        }
        return result;
    }

    public boolean hasMoney() {
        return !denominations.isEmpty();
    }

    public boolean isAmountAvailable(int expectedAmount) {
        return expectedAmount <= getTotalAmount();
    }

    public Map<Integer, Integer> withdrawAmount(int expectedAmount) throws NotEnoughMoneyException {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> nominals = new ArrayList<>(denominations.keySet());
        nominals.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0, n = nominals.size(); i < n; i++) {
            if (expectedAmount == 0)
                break;
            int count = expectedAmount / nominals.get(i);
            if (count == 0)
                continue;
            if (count > denominations.get(nominals.get(i))) {
                count = denominations.get(nominals.get(i));
            }
            expectedAmount -= count * nominals.get(i);
            result.put(nominals.get(i), count);
        }

        if (expectedAmount != 0)
            throw new NotEnoughMoneyException();
        else {
            for (Integer nominal : result.keySet()) {
                if (denominations.containsKey(nominal)) {
                    denominations.put(nominal, denominations.get(nominal) - result.get(nominal));
                }
            }
        }

        return result;
    }

    /*public Map<Integer, Integer> getDenominations() {
        return denominations;
    }*/
/*
    public static void main(String[] args) {
        CurrencyManipulator cm = new CurrencyManipulator("UAH");
        cm.addAmount(100, 4);
        cm.addAmount(200, 4);
        cm.addAmount(50, 4);
        cm.addAmount(500, 1);
        cm.addAmount(20, 4);
        System.out.println(cm.denominations);
        try {
            System.out.println(cm.withdrawAmount(600));
            System.out.println(cm.denominations);
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException");
        }
    }
*/
}
