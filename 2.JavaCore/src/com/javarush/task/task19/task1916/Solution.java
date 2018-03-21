package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1 = "";
        String file2 = "";
        List<String> arrayList1=new ArrayList<>();
        List<String> arrayList2=new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader rFile1 = new BufferedReader(new FileReader(file1)); BufferedReader rFile2 = new BufferedReader(new FileReader(file2))) {

         while (rFile1.ready()){
             String fileReader1=rFile1.readLine();
arrayList1.add(fileReader1);
         }
         while (rFile2.ready()){
             String fileReader2=rFile2.readLine();
arrayList2.add(fileReader2);
         }

        } catch (FileNotFoundException a) {
            a.printStackTrace();
        }

        for (int i = 0; i < arrayList1.size(); i++) {
            try {
                if (arrayList1.get(i).equals(arrayList2.get(0))) {
                    lines.add(new LineItem(Type.SAME, arrayList1.get(i)));
                    arrayList2.remove(0);
                } else if (arrayList1.get(i).equals(arrayList2.get(1))) {
                    lines.add(new LineItem(Type.ADDED, arrayList2.get(0)));
                    arrayList2.remove(0);
                    i--;
                } else {
                    lines.add(new LineItem(Type.REMOVED, arrayList1.get(i)));
                }
            } catch (IndexOutOfBoundsException e) {
                if ((arrayList1.size() - i) > arrayList2.size())
                    lines.add(new LineItem(Type.REMOVED, arrayList1.get(i)));
                else lines.add(new LineItem(Type.ADDED, arrayList2.get(0)));
            }
        }
        if (arrayList2.size() > 0) {
            for (int i = 0; i < arrayList2.size(); i++) {
                lines.add(new LineItem(Type.ADDED, arrayList2.get(i)));
            }
        }


        for (LineItem line : lines) {
            System.out.println(line.toString());
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }
}
