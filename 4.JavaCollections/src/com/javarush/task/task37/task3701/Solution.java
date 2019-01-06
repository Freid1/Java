package com.javarush.task.task37.task3701;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* 
Круговой итератор
*/
public class Solution<T> extends ArrayList<T> {
    @Override
    public Iterator<T> iterator() {
        return new RoundIterator();
    }

    public static void main(String[] args) {
        Solution<Integer> list = new Solution<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int count = 0;
        for (Integer i : list) {
            //1 2 3 1 2 3 1 2 3 1
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                break;
            }
        }

    }

    public class RoundIterator implements Iterator {
        Iterator<T> iterator = Solution.super.iterator();


        @Override
        public boolean hasNext() {
            return (Solution.this.size() > 0);
        }

        @Override
        public Object next() {

            try {
                return iterator.next();
            } catch (NoSuchElementException e) {
               iterator = Solution.super.iterator();
                return iterator.next();
            }

        }

        @Override
        public void remove() {
            iterator.remove();
        }
    }
}
