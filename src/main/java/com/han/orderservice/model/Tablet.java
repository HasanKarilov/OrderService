package com.han.orderservice.model;



import com.han.orderservice.model.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {

    /**
     * Observable — интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
     * Observer — интерфейс, с помощью которого наблюдатель получает оповещение;
     * т.е. Tablet рассылает оповешения наблюдателям, в нашем случае Cook.

     * номер планшета, чтобы можно было однозначно установить, откуда поступил заказ
     */
    private final int number;
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

            if(!order.isEmpty()) {
                setChanged();
                notifyObservers(order);
            }
            return order;
        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString()
    {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}