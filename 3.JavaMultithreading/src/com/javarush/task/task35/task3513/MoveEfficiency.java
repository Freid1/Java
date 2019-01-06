package com.javarush.task.task35.task3513;

public class MoveEfficiency implements Comparable {
    private int numberOfEmptyTiles;
    private int score;
    Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }


    public int compareTo(MoveEfficiency another) {
        if (this.numberOfEmptyTiles != another.numberOfEmptyTiles) {
            return Integer.compare(this.numberOfEmptyTiles, another.numberOfEmptyTiles);
        } else {
            return Integer.compare(this.score, another.score);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
