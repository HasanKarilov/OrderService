package com.han.orderservice.model.kitchen;

import com.han.orderservice.model.ConsoleHelper;
import com.han.orderservice.model.Tablet;

import java.util.Observable;
import java.util.Observer;

public class Waitor implements Observer{

    private int id;
    private Tablet tablet;


    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " was cooked by " + cook + " my Tablet is " + tablet.getNumber());
    }
}
