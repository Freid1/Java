import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Vimpire {


    public static void main(String[] args) throws InterruptedException, IOException {
        for (int i = 0; i < 99; i++) {
            int i1Number = (int) i / 10;
            int i2Number = i - (i1Number * 10);
            for (int j = 0; j < 99; j++) {
                int sum = i*j;
                if(sum>1000){

                    int j1Number = (int) j / 10;
                    int j2Number = j - (j1Number * 10);
                    int sum1000 = (int) sum / 1000;
                    int sum100 = ((int) sum / 100) - sum1000 * 10;
                    int sum10 = ((int) sum / 10) - sum1000 * 100 - sum100 * 10;
                    int sum1 = sum - sum1000 * 1000 - sum100 * 100 - sum10 * 10;

                    ArrayList<Integer> numder = new ArrayList<Integer>();
                    numder.add(i1Number);
                    numder.add(i2Number);
                    numder.add(j1Number);
                    numder.add(j2Number);
                    ArrayList<Integer> summer = new ArrayList<Integer>();
                    summer.add(sum1);
                    summer.add(sum10);
                    summer.add(sum100);
                    summer.add(sum1000);


                    for (int k = numder.size() - 1; k >= 0; k--) {
                        for (int l = summer.size() - 1; l >= 0; l--) {
                            if (numder.get(k) == summer.get(l)) {
                                numder.remove(k);
                                summer.remove(l);
                                break;
                            }
                        }
                    }
                    if (summer.isEmpty() && numder.isEmpty()) {
                        System.out.println(sum);
                        System.out.println(j+" "+i);
                    }


                }
            }
        }


    }


}
