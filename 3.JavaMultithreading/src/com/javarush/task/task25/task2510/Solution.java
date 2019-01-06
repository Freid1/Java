package com.javarush.task.task25.task2510;

/*
Поживем - увидим
*/
public class Solution extends Thread {

    public void error() {
        throw new Error();
    }

    public Solution() {
        this.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error) {
                    System.out.println("Нельзя дальше работать");
                    return;
                }
                if (e instanceof Exception) {
                    System.out.println("Надо обработать");
                    return;
                }
                if (e instanceof Throwable) {
                    System.out.println("Поживем - увидим");
                    return;
                }
            }
        });

    }

    @Override
    public void run() {
        error();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.start();
    }

}
