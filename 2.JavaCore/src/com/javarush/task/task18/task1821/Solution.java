package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        FileInputStream file = new FileInputStream(args[0]);
        byte[] buff = new byte[file.available()];
        file.read(buff);

        // bubble sort
        for (int i = buff.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                byte tmp;
                if (buff[j] > buff[j + 1]) {
                    tmp = buff[j];
                    buff[j] = buff[j + 1];
                    buff[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < buff.length; i++)
        {
            int count = 0;
            for (int j = 0; j < buff.length; j++)
            {
                count = buff[i] == buff[j] ? count + 1 : count;
            }
            if (i == 0 || buff[i - 1] != buff[i])
                System.out.println((char) buff[i] + " " + count);
        }

        file.close();
    }
}
