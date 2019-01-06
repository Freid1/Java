package training;

import java.util.Scanner;

public class GuessTheMovies {

    public static void main(String[] args) {
       String guessFilm=movies();
       char [] arraysFilm=guessFilm.toCharArray();
       int lengthFilm=guessFilm.length();
        System.out.println("Ну что попробуем угадать название мультипликационного фильма с 10 раз состоящего из "+lengthFilm+" букв");
        Scanner scan=new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
            String text=scan.nextLine();
           if(guessFilm.equals(text)){
               System.out.println("Вы угадали");
               break;
           }
           else {
               char[] charText = text.toCharArray();
               System.out.println("Вы угадали " + check(arraysFilm, charText) + " букв");
               System.out.println("Ну что еще раз попробуем");
           }
        }
    }

    public static String movies() {
        String[] movi = {"зверополис", "фиксики", "пибоди", "смурфики", "тролли"};
        String film = movi[(int) (Math.random() * 5)];
     //   System.out.println(film);
        return film;
    }
    public static int check (char [] guessFilm, char [] writeFilm ){
        int number=0;
        for (int i = 0; i <guessFilm.length ; i++) {
            if(guessFilm[i]==writeFilm[i]){
                    number++;
                }
else{
                System.out.println(writeFilm[i]);

            }


        }
        System.out.println("Эти буквы вы не угадали");
        return number;
    }


}
