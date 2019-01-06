package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;
    State state;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            if (state != target.getState()) {
                state = target.getState();
                System.out.println(target.getState());
            }
            if (state == State.TERMINATED) {
                this.interrupt();

            }
        }

    }
}

