package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName=fileName;
    }

    public void writeObject(String string) throws IOException {

        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution kl2 = new Solution("File2.File");
        kl2.writeObject("Hello");
        ObjectOutputStream out = new ObjectOutputStream((kl2.stream));
        out.writeObject(kl2);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(kl2.fileName));
        Solution loadSolution = (Solution) in.readObject();
    }
}
