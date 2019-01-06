package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new LinkedList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
/*        boolean flag = true;
        if (partOfName != null) {
            flag &= file.getFileName().toString().contains(partOfName);
            foundFiles.add(file);
            return super.visitFile(file, attrs);
        }
        if (partOfContent != null) {
            String contents = new String(Files.readAllBytes(file));
            flag &= contents.contains(partOfContent);
            foundFiles.add(file);

            return super.visitFile(file, attrs);
        }
        if (maxSize > -1) {
            flag &= Files.size(file) <= maxSize;
            foundFiles.add(file);
            return super.visitFile(file, attrs);
        }
        if (minSize > -1) {
            flag &= Files.size(file) >= minSize;
            foundFiles.add(file);
            return super.visitFile(file, attrs);
        }
        if (flag) {
            foundFiles.add(file);
        }
        return super.visitFile(file, attrs);*/
        boolean partNaame = true;
        boolean partContent = true;
        boolean sizeMin = true;
        boolean sixeMax = true;
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String contents = new String(Files.readAllBytes(file));

        if (partOfName != null && !file.getFileName().toString().contains(partOfName)) {
            partNaame = false;
        }
        if (partOfContent != null && !contents.contains(partOfContent)) {
            partContent = false;
        }
        if (minSize > 0 && !(content.length >= minSize)) {
            sizeMin = false;
        }
        if (maxSize > 0 && !(content.length <= maxSize)) {
            sixeMax = false;
        }
        if (partNaame && partContent && sixeMax && sizeMin) {
            foundFiles.add(file);
        }

        return super.visitFile(file, attrs);
    }


    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }


    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }


    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }


    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
