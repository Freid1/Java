package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        List<Horse> tmp=getHorses();
        for (Horse horse : tmp) {
            horse.move();
        }
    }

    public void print() {
        List<Horse> tmp=getHorses();
        for (Horse horse : tmp) {
            horse.print();
        }
        for (int i = 0; i <10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner(){
        double tmpDistance=0;
        Horse tmper=null;
        for (Horse horse : getHorses()) {
            if (tmpDistance<horse.getDistance())
          tmpDistance=horse.getDistance();
            tmper=horse;
        }
        return tmper;
    }
    public void printWinner(){
        String name=getWinner().getName();
        System.out.println("Winner is "+name+"!");
    }

    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("First", 3, 0);
        Horse horse2 = new Horse("Second", 3, 0);
        Horse horse3 = new Horse("Third", 3, 0);
        List<Horse> list = new ArrayList<>();
        list.add(horse1);
        list.add(horse2);
        list.add(horse3);
        game = new Hippodrome(list);
        game.run();
        game.printWinner();


    }
}
