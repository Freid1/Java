package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Number {
    public static void main(String[] args) throws IOException {
        System.out.println("Введи чило и начнем угадывать....");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberTxt = reader.readLine();
        int number = Integer.parseInt(numberTxt);
        int answer = (int) (Math.random() * (number+1));
        System.out.println("Ну что вы вели диапозон цифр от 0 до " + number);
        System.out.println("А теперь попытайтель угадать его с 5 попыток");

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число:");
            int x = Integer.parseInt(reader.readLine());
            if (x > answer) {
                System.out.println("Вы не угадали число больше чем надо увы увы..");
            }
            if (x < answer) {
                System.out.println("Вы не угадали число меньше чем надо увы увы..");
            }
            if (x == answer) {
                System.out.println("Вы однако угадали, молодца так держать.");
                break;
            }
        }


    }


}



