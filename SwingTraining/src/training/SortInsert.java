package training;

import java.util.Arrays;

public class SortInsert {
    public static void main(String[] args) {
        int[] massiv = new int[1000];
        for (int k = 0; k < massiv.length; k++) {
            massiv[k] = (int) (Math.random() * 1000);
        }
        //System.out.println(Arrays.toString(massiv));
        sortBinarSerch(massiv);
        System.out.println("Массив отсортировался методом вставок+  Binary");
        //System.out.println(Arrays.toString(massiv));

        int[] massiv2 = new int[1000];
        for (int k = 0; k < massiv2.length; k++) {
            massiv2[k] = (int) (Math.random() * 1000);
        }
      //  System.out.println(Arrays.toString(massiv2));
        sortOriginal(massiv2);
        System.out.println("Массив отсортировался методом вставок");
      //  System.out.println(Arrays.toString(massiv2));

    }

    public static void sortOriginal(int[] array) {
        double time = System.nanoTime();
        for (int barier = 1; barier < array.length; barier++) {
            int newElement = array[barier];
            int location = barier - 1;
            while (location >= 0 && array[location] > newElement) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;

        }
        System.out.println(System.nanoTime() - time);
    }

    public static void sortBinarSerch(int[] array) {
        double time = System.nanoTime();
        for (int barier = 1; barier < array.length; barier++) {
            int newElement = array[barier];
            int location = Arrays.binarySearch(array, 0,barier-1,newElement);
            int locationBinaryS;
            if (location >= 0) {


                locationBinaryS = location;}
                else{            locationBinaryS = -(location) - 1;}
            System.arraycopy(array, locationBinaryS, array, locationBinaryS + 1,(barier-locationBinaryS));
            array[locationBinaryS] = newElement;

        }
        System.out.println(System.nanoTime() - time);
    }
}