package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(0<age&&age<=KidBoy.MAX_AGE){
            return  new KidBoy();
        }else if(KidBoy.MAX_AGE<age&&age<=TeenBoy.MAX_AGE){
            return new TeenBoy();
        }else if(TeenBoy.MAX_AGE<age){
            return new Man();
        }
        return null;
    }
}
