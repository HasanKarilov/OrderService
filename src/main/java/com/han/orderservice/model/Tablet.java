package com.han.orderservice.model;



import com.han.orderservice.model.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {

    /**
     * номер планшета, чтобы можно было однозначно установить, откуда поступил заказ
     */
    public final int number;
    public static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number)
    {
        this.number = number;
    }

    /**
     * Создает заказ из тех блюд, которые выберет пользователь
     */
    public Order createOrder(){
        try
        {
            Order order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
            return order;
        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
    }
    @Override
    public String toString()
    {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}