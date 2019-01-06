package com.javarush.task.task39.task3913;

import java.io.IOException;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        LogParser logParser = new LogParser(Paths.get("D:/IdeaProjects/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task39/task3913/logs"));
        System.out.println(logParser.getNumberOfUniqueIPs(null, null));
        System.out.println(logParser.getDateWhenUserDoneTask("Eduard Petrovich Morozko",48,null,null));
    }
}