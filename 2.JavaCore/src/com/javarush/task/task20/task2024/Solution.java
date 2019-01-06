package com.javarush.task.task20.task2024;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    transient List<Solution> edges = new LinkedList<>();
private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
objectOutputStream.defaultWriteObject();
node=edges.size();
objectOutputStream.writeInt(node);
    for (Solution edge : edges) {
        objectOutputStream.writeObject(edge);
    }
}
private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    objectInputStream.defaultReadObject();
    int size=objectInputStream.readInt();

    for (int i = 0; i < size; i++) {
         edges.add((Solution) objectInputStream.readObject());
    }


}
    public static void main(String[] args) {

    }
}
