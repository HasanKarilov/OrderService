package com.han.orderservice.model.dish;

public class Dish extends Product{
    public Dish(){

    }

    public Dish(int id, String description, double cost, int weight, int time) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.weight = weight;
        this.time = time;
        this.quantity = 0;
    }
}
