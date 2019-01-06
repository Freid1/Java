package training;

import java.lang.Exception;

public class NewTest {


    public static void main(String[] args) throws Exception {
        Cat cat1 = new Cat(1);
        Cat cat2 = new Cat(2);
        System.out.println( cat1.a);
        System.out.println(cat2.a);
        swap(cat1,cat2);
        System.out.println( cat1.a);
        System.out.println(cat2.a);
    }
    public static void swap(Cat x, Cat y) // не работает
    {
        Cat temp;
        temp = x;
        x = y;
        y = temp;
    }



}


class  Cat{
    int a=0;

    public Cat(int a) {
        this.a = a;
    }
}

