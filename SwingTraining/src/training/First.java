package training;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {


        int[] arrp = new int[10000];
        int a = 9999;
        for (int i = 0; i < 10000; i++) {

            arrp[i] = a;
            a--;

        }


        System.out.println(Arrays.toString(arrp));
        massivMin(arrp);
        massivBubbels(arrp);
        massivVib(arrp);

    }

    public static void massivMin(int[] arr) {
        long time = System.nanoTime();
        System.out.println("PerestanovkaMin");
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = arr.length - 1; j >= i; j--) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
                if (i == j) {
                    int tmp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = tmp;
                }
            }

        }


        System.out.println(Arrays.toString(arr));
        System.out.println((System.nanoTime() - time)/1000000);
    }

    public static void massivVib(int[] arr) {
        long time = System.nanoTime();
        System.out.println("Viborka");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }

        }


        System.out.println(Arrays.toString(arr));
        System.out.println((System.nanoTime() - time)/1000000);
    }

    public static void massivBubbels(int[] arr) {
        System.out.println("Bubbles");
        long time = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println((System.nanoTime() - time)/1000000);
    }
}

