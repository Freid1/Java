package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
static{
    threads.add(new ThreadOne());
    threads.add(new ThreadTwo());
    threads.add(new ThreadTree());
    threads.add(new ThreadFour());
    threads.add(new ThreadFive());
}
    public static void main(String[] args) {
    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        try {
            while (true) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
}

class ThreadTree extends Thread {
    @Override
    public void run() {
        while (!isInterrupted())
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}

class ThreadFour extends Thread implements Message {
    // Без volatile у меня нить не останавливалась
    protected volatile boolean keepGoing;
    public ThreadFour () {
        keepGoing = true;
    }
    public void run() {
        while (keepGoing) {

        }
    }
    public void showWarning() {
        keepGoing = false;
    }
}

class ThreadFive extends Thread {
    public void run() {
        BufferedReader cbr = new BufferedReader(new InputStreamReader(System.in));
        try {
            int sum = 0;
            // По какой-то причине while (cbr.ready()) { ... } не работает.
            while (!isInterrupted()) { // throws IOException
                String line = cbr.readLine();
                if (line.equals("N")) {
                    break;
                }
                try {
                    Integer n = Integer.parseInt(line);
                    sum += n;
                } catch (NumberFormatException e) {
                    // Ну и фиг с ним, не число и ладно, пропустим.
                }
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}