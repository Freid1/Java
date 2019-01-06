package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
Integer[] narray=sort(new Integer[]{13, 8, 15, 5, 17});
       // System.out.println(Arrays.toString(narray));

    }

        public static Integer[] sortet(Integer[] array) {
            ArrayList<Integer> list = new ArrayList<>();
            Integer[] arraySorted = array;

            list.addAll(Arrays.asList(arraySorted));
            Collections.sort(list);
            int pivot;
            if (list.size()%2 == 0)       pivot = (list.get(arraySorted.length/2)+list.get(arraySorted.length/2-1))/2;
            else pivot = list.get(arraySorted.length/2);

            Collections.sort(list, (integer, t1) -> Math.abs(pivot - integer) - Math.abs(pivot - t1));
            for (int i = 0; i < list.size(); i++) {
                arraySorted[i] = list.get(i);
            }




            return arraySorted;
        }
    public static Integer[] sort(Integer[] array) {

        Arrays.sort(array);
        Integer mediana;
        if(array.length%2!=0){
            mediana=array[array.length/2];
           // System.out.println(mediana);
         }
         else{
            mediana=(array[array.length/2-1]+array[array.length/2])/2;
            System.out.println(mediana);
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (Math.abs(array[i]-mediana)>Math.abs(array[j]-mediana)){
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }

        return array;
    }
}

