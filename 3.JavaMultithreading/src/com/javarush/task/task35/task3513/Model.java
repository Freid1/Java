package com.javarush.task.task35.task3513;

import java.util.*;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile gameTiles[][];
    int score = 0;
    int maxTile = 0;
    private Stack<Tile[][]> previousStates=new Stack();;
    private Stack<Integer> previousScores=new Stack();;
    private boolean isSaveNeeded=true;


    public Model() {
        resetGameTiles();

    }

    private void saveState(Tile[][] array) {
        Tile[][] tilesForStack = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH ; i++) {
            for (int j = 0; j < FIELD_WIDTH ; j++) {
                tilesForStack[i][j] = new Tile(array[i][j].value);
            }
        }
        previousStates.push(tilesForStack);
        previousScores.push(score);
        isSaveNeeded = false;

    }
    public void rollback(){
        if(!previousScores.isEmpty()&&!previousStates.isEmpty()){
        gameTiles = previousStates.pop();
        score= previousScores.pop();

        }
    }


    public void addTile() {
        List<Tile> emptyTile = getEmptyTiles();
        if (emptyTile.isEmpty()) {
            return;
        } else {
            int selectEmptyTile = (int) (Math.random() * emptyTile.size());
            int selectNumberFourOrTwo = (Math.random() < 0.9 ? 2 : 4);

            emptyTile.get(selectEmptyTile).value = selectNumberFourOrTwo;
        }
    }

    public List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles.length; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    emptyTiles.add(gameTiles[i][j]);
                }
            }
        }

        return emptyTiles;
    }

    void resetGameTiles() {
   /*     gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        gameTiles[0][0] = new Tile(1);
        gameTiles[0][1] = new Tile(1);
        gameTiles[0][2] = new Tile(1);
        gameTiles[0][3] = new Tile(1);

        gameTiles[1][0] = new Tile(2);
        gameTiles[1][1] = new Tile(2);
        gameTiles[1][2] = new Tile(2);
        gameTiles[1][3] = new Tile(2);

        gameTiles[2][0] = new Tile(3);
        gameTiles[2][1] = new Tile(3);
        gameTiles[2][2] = new Tile(3);
        gameTiles[2][3] = new Tile(3);

        gameTiles[3][0] = new Tile(4);
        gameTiles[3][1] = new Tile(4);
        gameTiles[3][2] = new Tile(4);
        gameTiles[3][3] = new Tile(4);*/
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private boolean compressTiles(Tile[] tiles) {
        boolean isChanged = false;

        for (int i = 0; i < tiles.length - 1; i++) {
            for (int j = 0; j < tiles.length - 1; j++) {
                if (tiles[j].value == 0 && tiles[j + 1].value != 0) {
                    Tile buffTile = tiles[j];
                    tiles[j] = tiles[j + 1];
                    tiles[j + 1] = buffTile;
                    isChanged = true;
                }
            }
        }
        return isChanged;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean isChanged = false;

        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value != 0 && tiles[i].value == tiles[i + 1].value) {
                tiles[i].value = tiles[i].value + tiles[i + 1].value;
                tiles[i + 1].value = 0;


                score += tiles[i].value;
                if (tiles[i].value > maxTile) maxTile = tiles[i].value;
                isChanged = true;
            }
        }
        compressTiles(tiles);
        return isChanged;
    }

    void left() {
        if(isSaveNeeded){
            saveState(gameTiles);
        }
        boolean changesForAdd = false;
        for (int i = 0; i < gameTiles.length; i++) {
            boolean changesComress = compressTiles(gameTiles[i]);
            boolean changesMerge = mergeTiles(gameTiles[i]);
            if (changesComress || changesMerge) changesForAdd = true;
        }
        if (changesForAdd) addTile();
    }

    void up() {
        saveState(gameTiles);
        converRight();
        left();
        converLeft();
    }

    void right() {
        saveState(gameTiles);
        converLeft();
        converLeft();
        left();
        converRight();
        converRight();
    }

    void down() {
        saveState(gameTiles);
        converLeft();
        left();
        converRight();
    }

    public void converRight() {
        // System.out.println(Arrays.deepToString(gameTiles));
        Tile tmpTiles[][] = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tmpTiles[j][i] = gameTiles[i][FIELD_WIDTH - 1 - j];
            }
        }
        gameTiles = tmpTiles;

        //  System.out.println(Arrays.deepToString(tmpTiles));
    }

    public void converLeft() {
        //  System.out.println(Arrays.deepToString(gameTiles));
        Tile tmpTiles[][] = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tmpTiles[i][j] = gameTiles[FIELD_WIDTH - 1 - j][i];
            }
        }
        gameTiles = tmpTiles;
        // System.out.println(Arrays.deepToString(gameTiles));
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    public boolean canMove() {
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles.length; j++) {
                if (gameTiles[i][j].value == 0 || checkForMergeTile(i, j)) return true;
            }
        }
        return false;
    }

    private boolean checkForMergeTile(int rows, int columns) {
        if (columns != 0 && gameTiles[rows][columns - 1].value == gameTiles[rows][columns].value) return true;
        if (columns != FIELD_WIDTH - 1 && gameTiles[rows][columns + 1].value == gameTiles[rows][columns].value)
            return true;
        if (rows != 0 && gameTiles[rows - 1][columns].value == gameTiles[rows][columns].value) return true;
        if (rows != FIELD_WIDTH - 1 && gameTiles[rows + 1][columns].value == gameTiles[rows][columns].value)
            return true;
        return false;
    }

    void randomMove(){
        int n = ((int) (Math.random() * 100)) % 4;
        switch (n) {
            case 0:
                left();
                break;
            case 1:
                right();
                break;
            case 2:
                up();
                break;
            case 3:
                down();
                break;
        }

    }

    public boolean hasBoardChanged(){
        return isDifferentTwoTileArrays(gameTiles,previousStates.peek());
    }

    private boolean isDifferentTwoTileArrays(Tile[][] tileOne, Tile[][] tileTwo){
        for (int i = 0; i < FIELD_WIDTH ; i++) {
            for (int j = 0; j < FIELD_WIDTH ; j++) {
                if (tileOne[i][j].value != tileTwo[i][j].value){
                    return true;
                }
            }
        }
        return false;
    }

    MoveEfficiency getMoveEfficiency(Move move){

        MoveEfficiency efficiency;

        move.move();
        if (hasBoardChanged()){
            efficiency = new MoveEfficiency(getEmptyTiles().size(),score,move);

        }
        else{
            efficiency = new MoveEfficiency(-1,0,move);
        }
        rollback();
        return efficiency;
    }

    public void autoMove(){
        PriorityQueue<MoveEfficiency> efficiencyPriorityQueue = new PriorityQueue<>(4,Collections.reverseOrder());
        efficiencyPriorityQueue.offer(getMoveEfficiency(this::left));
        efficiencyPriorityQueue.offer(getMoveEfficiency(this::right));
        efficiencyPriorityQueue.offer(getMoveEfficiency(this::up));
        efficiencyPriorityQueue.offer(getMoveEfficiency(this::down));
        efficiencyPriorityQueue.poll().getMove().move();
    }
}
