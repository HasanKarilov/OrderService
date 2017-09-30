package com.han.orderservice.model;


import com.han.orderservice.model.kitchen.Cook;
import com.han.orderservice.model.kitchen.Waitor;

public class Restaurant {
    public static void main(String[] args) {

        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Aykol");
        Waitor waitor = new Waitor();
        waitor.setTablet(tablet);

        tablet.addObserver(cook);
        cook.addObserver(waitor);
        tablet.createOrder();

    }
}
