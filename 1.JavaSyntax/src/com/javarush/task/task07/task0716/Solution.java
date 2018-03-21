package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2


        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> lestt) {
        ArrayList<String> listNew=new ArrayList<>();
        for (int i = 0; i <lestt.size(); i++) {
            if (lestt.get(i).contains("р")||lestt.get(i).contains("л")){
                if (!(lestt.get(i).contains("р")&&lestt.get(i).contains("л"))) {
                    if (lestt.get(i).contains("р")){
                       continue;
                    }
                    if (lestt.get(i).contains("л"))
                    {
                        listNew.add(lestt.get(i));
                        listNew.add(lestt.get(i));

                    }


                }
                else
                    listNew.add(lestt.get(i));
            }
            else
                listNew.add(lestt.get(i));

        }

        return listNew;
    }
}

    /* for (int i = 0; i <lestt.size(); i++) {
        if (lestt.get(i).contains("р")||lestt.get(i).contains("л")){
        if (!(lestt.get(i).contains("р")&&lestt.get(i).contains("л"))) {
        if (lestt.get(i).contains("р")){
        lestt.remove(i);
        }
        if (lestt.get(i).contains("л"))
        {
        lestt.add(i,lestt.get(i));
        i++;
        }


        }
        }

        }

        return lestt;*/