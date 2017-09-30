package com.han.orderservice.model.dish;

/**
 * Created by hanaria on 9/30/17.
 */
public class Product {
    protected int id;
    protected String description;
    protected double cost;
    protected int quantity;
    protected int weight;
    protected int time;
    protected DishType type;

    public Product(){

    }

    public Product(int id, String description, double cost, int weight, int time, DishType type) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.weight = weight;
        this.time = time;
        this.type = type;
        this.quantity = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }
}
