package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {
    public void testStorage(Shortener shortener) {
        String string1 = "String unity";
        String string2 = "Unity string";
        String string3 = "String unity";
        Long long1 = shortener.getId(string1);
        Long long2 = shortener.getId(string2);
        Long long3 = shortener.getId(string3);
        Assert.assertNotEquals(long2, long1);
        Assert.assertNotEquals(long2, long3);
        Assert.assertEquals(long1, long3);

        String stringL1 = shortener.getString(long1);
        String stringL2 = shortener.getString(long2);
        String stringL3 = shortener.getString(long3);

        Assert.assertEquals(string1, stringL1);
        Assert.assertEquals(string2, stringL2);
        Assert.assertEquals(string3, stringL3);


    }

    @Test
    public void testHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testFileStorageStrategy() {
        Shortener shortener = new Shortener(new FileStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testDualHashBidiMapStorageStrategy() {
        Shortener shortener = new Shortener(new DualHashBidiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);
    }
}
