package com.javarush.task.task22.task2213;

public class Test {
    private int width=10;
    private int height=20;
    private int[][] matrix=new int[height][width];

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j]==0){
                    System.out.print(" . ");
                }
                else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public void line(){
        matrix[height-2][3]=1;
        matrix[3][7]=1;
        for (int i = 0; i <width ; i++) {
            matrix[height-1][i]=1;
            matrix[5][i]=1;
        }
    }

    public void removeFullLines() {

        for (int i = height-1; i >=0; i--) {
            boolean delete=true;
            for (int j = width-1; j >=0; j--) {
                if (matrix[i][j]==0){
                    delete=false;
                }
            }
            if(delete){
                for (int j = i; j >0 ; j--) {
                    matrix[j] = matrix[j-1];
                }
                matrix[0] = new int[width];
            }
        }

}

    public static void main(String[] args) {
        Test t=new Test();
        t.print();
        t.line();
        t.print();

    }}
