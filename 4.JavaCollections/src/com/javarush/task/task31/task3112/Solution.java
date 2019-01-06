package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/My"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL pathURl=new URL(urlString);
        String name=pathURl.toString().substring(urlString.lastIndexOf("/")+1,urlString.length());
        InputStream inputStream=pathURl.openStream();
        Path tmp=Files.createTempFile("tmp",".txt");
        Files.copy(inputStream,tmp,StandardCopyOption.REPLACE_EXISTING);

inputStream.close();
      return  Files.move(tmp,downloadDirectory.resolve(name));


    }
}
