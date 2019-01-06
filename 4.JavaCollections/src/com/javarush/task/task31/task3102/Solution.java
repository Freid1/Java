package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
       List<String> listAbsolutPath=new ArrayList<>();
        Queue<File> queuePath=new PriorityQueue<>();

        File fileRoot=new File(root);

        Collections.addAll(queuePath,fileRoot.listFiles());

        while (!queuePath.isEmpty()){
           File pathNew=queuePath.remove();
           if(pathNew.isDirectory()){
               Collections.addAll(queuePath,pathNew.listFiles());
           }
           else{
               listAbsolutPath.add(pathNew.getAbsolutePath());
           }
        }


        return listAbsolutPath;

    }

    public static void main(String[] args) {
        
    }
}
