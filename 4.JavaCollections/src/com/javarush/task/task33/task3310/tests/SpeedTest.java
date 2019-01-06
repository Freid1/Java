package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeForGettingIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date dateStart = new Date();
        for (String string : strings) {
            ids.add(shortener.getId(string));
        }
        Date dateFinish = new Date();
        return dateFinish.getTime() - dateStart.getTime();
    }

    public long getTimeForGettingStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date dateStart = new Date();
        for (Long id : ids) {
            strings.add(shortener.getString(id));
        }
        Date dateFinish = new Date();
        return dateFinish.getTime() - dateStart.getTime();
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());

        Set<String> origStrings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());

        }

        Set<Long> ids = new HashSet<>();
        Long timeWhithHashMapIds= getTimeForGettingIds(shortener1, origStrings, ids);
        Long timeWhithHashMapStrings = getTimeForGettingStrings(shortener1,ids,new HashSet<String>());

        Set<Long> idsBi = new HashSet<>();
        Long timeWhithHashBiMapIds = getTimeForGettingIds(shortener2, origStrings,idsBi);
        Long timeWhithHashBiMapStrings = getTimeForGettingStrings(shortener2,idsBi,new HashSet<String>());


        Assert.assertEquals(new Date(timeWhithHashMapStrings).getTime(),new Date(timeWhithHashBiMapStrings).getTime(),30);

    }

}
