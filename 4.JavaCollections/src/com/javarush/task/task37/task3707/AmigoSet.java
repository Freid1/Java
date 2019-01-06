package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public boolean remove(Object o) {
        if (map.remove((E) o) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            AmigoSet amigo = (AmigoSet) super.clone();
            amigo.map = (HashMap) map.clone();
            return amigo;
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{

        int capacity = in.readInt();
        float loadFactor = in.readFloat();
        int size = (int)(capacity/loadFactor);
        in.defaultReadObject();

        map = new HashMap<>(capacity,loadFactor);
        int sizeMap = in.readInt();
        for (int i = 0; i < sizeMap ; i++) {
            map.put((E)in.readObject(), PRESENT);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException{
        int capacity = (int)HashMapReflectionHelper.callHiddenMethod(map, "capacity");
        float loadFactor = (float)HashMapReflectionHelper.callHiddenMethod(map, "loadFactor");

        out.writeInt(capacity);
        out.writeFloat(loadFactor);
        out.defaultWriteObject();
        out.writeInt(size());
        map.keySet().forEach((key) -> {
            try {
                out.writeObject(key);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        out.flush();

    }

}
