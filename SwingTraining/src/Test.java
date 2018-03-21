import java.io.FileNotFoundException;
import java.util.Formatter;


public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        String first="115454";
       String second="Idnfkdnfkndfkn";
       String therd="423434fkn";
        Formatter formatter=new Formatter();

 formatter.format("%-4.4s%-10.10s%-8.8s",first,second,therd);
 String dfd=formatter.toString();

        System.out.println(dfd);




    }



}

