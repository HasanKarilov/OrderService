package com.han.orderservice.model.dish;

public class Garnish extends Product{
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Garnish(int id, String description, double cost, int weight, int time) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.weight = weight;
        this.time = time;
        this.quantity = 0;
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + " " + this.description;
    }

    @Override
    public double getCost() {
        return dish.getCost() + this.cost;
    }
}
