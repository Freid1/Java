package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = "";
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (args[0].equals("-c")) {
            int id = idNumber(fileName);
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);

            StringBuilder str = new StringBuilder("");
            str.append(id);
            while (str.length()<8){
                str.append(" ");
            }
            if (args[1].length()>30){
                str.append(args[1].substring(0,30));
            }
            else if(args[1].length()<30)
            {
                str.append(args[1]);
                while (str.length()<38){
                    str.append(" ");
                }
            }
            else{
                str.append(args[1]);
            }


            if (args[2].length()>8){
                str.append(args[2].substring(0,8));
            }
            else if(args[2].length()<8)
            {
                str.append(args[2]);
                while (str.length()<46){
                    str.append(" ");
                }
            }
            else{
                str.append(args[2]);
            }

            if (args[3].length()>4){
                str.append(args[3].substring(0,4));
            }
            else if(args[3].length()<4)
            {
                str.append(args[3]);
                while (str.length()<50){
                    str.append(" ");
                }
            }
            else{
                str.append(args[3]);
            }




            String idstring = str.toString();


            byte[] stringByte = idstring.getBytes();


            fileOutputStream.write(10);
            fileOutputStream.write(stringByte);

            fileOutputStream.close();

        }


     /*   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }*/


    }

    public static int idNumber(String file) {
        String line = "";
        String last = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));) {
            while (null != (line = bufferedReader.readLine())) {
                last = line;
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        int sizearr;
        if (last.length() > 7) {
            sizearr = 8;
        } else {
            sizearr = last.length();
        }
        char[] charLast = last.substring(0, sizearr).toCharArray();

        String idString = "";
        for (char c : charLast) {
            if (Character.isDigit(c))
                idString = idString + c;
        }
        int idTemp = Integer.parseInt(idString);


        return idTemp + 1;
    }


}
