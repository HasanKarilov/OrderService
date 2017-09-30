package com.han.orderservice.model.kitchen;

import com.han.orderservice.model.ConsoleHelper;
import com.han.orderservice.model.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Создает заказ и выводит его данные
 */
public class Order {
    /**
     * Ссылка на таблетку и список блюд
     */
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public int getTotalCookingTime(){
        int sum = 0;
        for(Dish dish: dishes){
            sum = sum + dish.getDuration();
        }
        return sum;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString()
    {
        if (dishes.isEmpty())
            return "";
        else return "Your order: " + dishes +" of "+  tablet;
    }
}