package com.han.orderservice.model.dish;

public enum DishType {

    SALAD("Salad"),
    FOOD("Food"),
    DRINK("Drink");

    private String type;

    private DishType(String type){
        this.type = type;
    }

}
