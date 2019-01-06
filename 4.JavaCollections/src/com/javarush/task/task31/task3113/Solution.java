package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/*
Что внутри папки?
*/
public class Solution extends SimpleFileVisitor<Path> {
    private int countFolders;
    private int countFile;
    private long sizeFile;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи путь к папке.");
        String pathString = bufferedReader.readLine();
        bufferedReader.close();
        Path path = Paths.get(pathString);
        if (!Files.isDirectory(path)) {
            System.out.println(pathString + " - не папка");
            return;
        }
        Solution walkFolders = new Solution();

        Path pathArray = Files.walkFileTree(path, walkFolders);

        System.out.println("Всего папок - " + (walkFolders.countFolders-1));
        System.out.println("Всего файлов - " + walkFolders.countFile);
        System.out.println("Общий размер - " + walkFolders.sizeFile);

    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!Files.isDirectory(file)) {
            countFile+=1;
            sizeFile = sizeFile + attrs.size();
        }

        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        countFolders+=1;
        return super.postVisitDirectory(dir, exc);
    }
}

