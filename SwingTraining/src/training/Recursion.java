package training;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        rec(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    static void rec(int arrayT[], int len) {
        if (len < 2) {
            System.out.println(Arrays.toString(arrayT));
        } else {
            for (int k = 0; k < len; k++) {
                Chenge(arrayT, k, len - 1);
                rec(arrayT, len - 1);
                Chenge(arrayT,len-1,k);
            }

        }
    }

    static void Chenge(int arrTmp[], int a, int b) {
        int tmp = arrTmp[a];
        arrTmp[a] = arrTmp[b];
        arrTmp[b] = tmp;
    }

}

