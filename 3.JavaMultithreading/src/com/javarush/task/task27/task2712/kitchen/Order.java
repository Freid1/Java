package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    @Override
    public String toString() {
        if (isEmpty())return "";
        else {
            StringBuilder orderDishes = new StringBuilder();
            orderDishes.append(dishes.get(0));
            for (int i = 1; i <dishes.size() ; i++) {
                orderDishes.append(", ");
                orderDishes.append(dishes.get(i).toString());
            }
            return "Your order: ["+orderDishes.toString()+"] of "+tablet.toString();
        }
    }

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes=ConsoleHelper.getAllDishesForOrder();


    }
    public int getTotalCookingTime(){
        int total=0;
        for (Dish dish : dishes) {
           total=total+dish.getDuration();
        }
        return total;
    }
    public boolean isEmpty(){
        return dishes.isEmpty();
    }
}
