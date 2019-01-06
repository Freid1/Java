package com.javarush.task.task22.task2205;

/* 
МНЕ нравится курс JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {
        String[] str = {"%4$S %3$s %2$s %1$s",
                "%4$S %3$s %1$s %2$s",
                "%4$S %2$s %1$s %3$s",
                "%4$S %2$s %3$s %1$s",
                "%4$S %1$s %2$s %3$s",
                "%4$S %1$s %3$s %2$s",
                "%3$S %4$s %2$s %1$s",
                "%3$S %4$s %1$s %2$s",
                "%3$S %2$s %1$s %4$s",
                "%3$S %2$s %4$s %1$s",
                "%3$S %1$s %4$s %2$s",
                "%3$S %1$s %2$s %4$s",
                "%2$S %1$s %3$s %4$s",
                "%2$S %1$s %4$s %3$s",
                "%2$S %4$s %1$s %3$s",
                "%2$S %4$s %3$s %1$s",
                "%2$S %3$s %1$s %4$s",
                "%2$S %3$s %4$s %1$s",
                "%1$S %4$s %2$s %3$s",
                "%1$S %4$s %3$s %2$s",
                "%1$S %3$s %2$s %4$s",
                "%1$S %3$s %4$s %2$s",
                "%1$S %2$s %4$s %3$s",
                "%1$S %2$s %3$s %4$s"};

       // return str[(int) (str.length*Math.random())];
        return   "%3$S %4$s %2$s %1$s";
    }
}
