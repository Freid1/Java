package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(Squerl(-5));
        System.out.println(Squerl(5));
        System.out.println(Squerl(0));
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        System.out.println(a);

        Scanner sc=new Scanner(System.in);
        String b =sc.nextLine();


    }
    public static int Squerl(int number)  {
/*
        if(number==0){
            throw new ArithmeticException();
        }
*/
        return 10/number;

    }
}
