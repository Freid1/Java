package com.javarush.task.task37.task3702.female;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(0<age&&age<=KidGirl.MAX_AGE){
            return  new KidGirl();
        }else if(KidGirl.MAX_AGE<age&&age<=TeenGirl.MAX_AGE){
            return new TeenGirl();
        }else if(TeenGirl.MAX_AGE<age){
            return new Woman();
        }
        return null;
    }
}
