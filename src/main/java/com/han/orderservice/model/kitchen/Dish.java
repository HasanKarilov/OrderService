package com.han.orderservice.model.kitchen;


public enum Dish {
    Lagman(25),
    Plov(20),
    Manty(15),
    Samsy(5);

    private int duration;

    private Dish(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){
        StringBuilder sb = new StringBuilder();
        for(Dish dish: Dish.values()){

            sb.append(dish);
            if(dish.ordinal() != Dish.values().length-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}