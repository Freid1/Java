public class TestException {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        byte[][] tmp = new byte[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {                     // строки
            for (int j = 0; j < a.length; j++) {                  // столбцы
                tmp[i][j] = a[i][j];
            }
        }
        int count = 0;
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[0].length - 1; j++) {
                to:
                if (tmp[i][j] == 1) {
                    if (tmp[i][j + 1] == 0) {
                        for (int k = 0; k < tmp.length; k++) {
                            if (tmp[k][j] == 0||k==tmp.length-1) {
                                for (int l = 0; l <= k; l++) {
                                    for (int m = 0; m <= j; m++) {
                                        tmp[l][m] = 0;

                                    }  }
                                count++;
                                break to;
                            } }
                    }
                    if (tmp[i][j + 1] == 1){
                        for (int k = 0; k < tmp.length; k++) {
                            if (tmp[k][j] == 0||k==tmp.length-1) {
                                for (int l = 0; l <= k; l++) {
                                    for (int m = 0; m <= j; m++) {
                                        tmp[l][m] = 0;

                                    }  }
                                count++;
                                break to;
                            }

                        }
                    }
                    }
                }


            }


        return count;
    }
}
