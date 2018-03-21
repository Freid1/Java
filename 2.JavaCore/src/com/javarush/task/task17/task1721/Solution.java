package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String tmp;

        reader.close();

        BufferedReader resderFileFirst = new BufferedReader(new InputStreamReader(new FileInputStream(firstFile)));
        BufferedReader resderFileSecond = new BufferedReader(new InputStreamReader(new FileInputStream(secondFile)));


        while ((tmp = resderFileFirst.readLine()) != null) {
            allLines.add(tmp);
        }
        while ((tmp = resderFileSecond.readLine()) != null) {
            forRemoveLines.add(tmp);
        }

        resderFileFirst.close();
        resderFileSecond.close();
        Solution sol=new Solution();
        try {
            sol.joinData();
        } catch (CorruptedDataException e) {

        }


    }

    public void joinData() throws CorruptedDataException {
        Set set = new HashSet<String>();
        set.addAll(forRemoveLines);

        for (Object tmpr : set) {
            if (allLines.contains(tmpr)) {
                allLines.remove(tmpr);
            } else {
allLines.clear();
                throw new CorruptedDataException();
            }

        }
    }
}
