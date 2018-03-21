package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        String txt=fileName.substring(fileName.length()-4,fileName.length());
        if(!txt.equals(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }



    }


    public static void main(String[] args) throws IOException, UnsupportedFileNameException {


    }
}

